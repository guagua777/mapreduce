package com.bj58.fang;

import com.alibaba.fastjson.JSON;
import com.bj58.fang.hugopenapi.vo.house.SaleHouseVo;
import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;
import java.util.StringTokenizer;

public class XiaoQuNameMapper extends Mapper<LongWritable, Text, Text, IntWritable> {

    private final static IntWritable one = new IntWritable(1);
    private Text word = new Text();

    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        StringTokenizer itr = new StringTokenizer(value.toString());
        while (itr.hasMoreTokens()) {
            String line = itr.nextToken();
            if (line.contains("postHouse, saleHouseVo")){
                String subLine = line.split("postHouse, saleHouseVo:")[1];
                SaleHouseVo saleHouseVo = JSON.parseObject(subLine, SaleHouseVo.class);
                if (StringUtils.isNotEmpty(saleHouseVo.getXiaoqu())) {
                    word.set(saleHouseVo.getClientId());
                    context.write(word, one);
                }
            }
        }
    }
}
