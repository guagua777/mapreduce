package com.bj58.fang;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.util.GenericOptionsParser;

import org.apache.hadoop.fs.Path;

public class XiaoQuNameJob {

    /**
     * 运行命令 ./hadoop jar /opt/soft/hadoop/taskjars/mapreduce.jar com.bj58.fang.XiaoQuNameJob  /hbgopenapilog /hbgxiaoquresult/
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Configuration conf = new Configuration();
        String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
        if (otherArgs.length < 2) {
            System.err.println("Usage: wordcount <in> [<in>...] <out>");
            System.exit(2);
        }
        Job job = Job.getInstance(conf, "XiaoQuNameMapReducer");
        job.setJarByClass(XiaoQuNameJob.class);
        job.setMapperClass(XiaoQuNameMapper.class);
        job.setCombinerClass(XiaoQuNameReducer.class);
        job.setReducerClass(XiaoQuNameReducer.class);
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);

        for (int i = 0; i < otherArgs.length - 1; ++i) {
            FileInputFormat.addInputPath(job, new Path(otherArgs[i]));
        }
        FileOutputFormat.setOutputPath(job, new Path(otherArgs[otherArgs.length - 1]));
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    }


}
