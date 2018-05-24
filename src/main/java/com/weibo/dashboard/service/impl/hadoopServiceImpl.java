//package com.weibo.dashboard.service.impl;
//
//import com.weibo.dashboard.service.hadoopService;
//import javafx.application.Application;
//import org.apache.hadoop.io.IntWritable;
//import org.apache.hadoop.io.LongWritable;
//import org.apache.hadoop.io.Text;
//import org.apache.hadoop.mapred.FileInputFormat;
//import org.apache.hadoop.mapred.FileOutputFormat;
//import org.apache.hadoop.mapred.TextInputFormat;
//import org.apache.hadoop.mapred.TextOutputFormat;
//import org.apache.hadoop.mapreduce.Job;
//import org.apache.hadoop.mapreduce.Mapper;
//import org.apache.hadoop.mapreduce.Reducer;
//import org.springframework.stereotype.Service;
//
//import javax.security.auth.login.Configuration;
//import java.io.IOException;
//import java.nio.file.Path;
//import java.util.StringTokenizer;
//
//@Service
//public class hadoopServiceImpl implements hadoopService {
//
//
//    public static class WordCountMap extends Mapper<LongWritable, Text, Text, IntWritable> {
//        private final IntWritable one = new IntWritable(1);
//        private Text word = new Text();
//
//        public void map(LongWritable key, Text value, Context context)
//                throws IOException, InterruptedException {
//            String line = value.toString();
//            StringTokenizer token = new StringTokenizer(line);
//            while (token.hasMoreTokens()) {
//                word.set(token.nextToken());
//                context.write(word, one);
//            }
//        }
//    }
//
//
//
//
//    public static class WordCountReduce extends Reducer<Text, IntWritable, Text, IntWritable> {
//        public void reduce(Text key, Iterable<IntWritable> values,
//                           Context context) throws IOException, InterruptedException {
//            int sum = 0;
//            for (IntWritable val : values) {
//                sum += val.get();
//            }
//            context.write(key, new IntWritable(sum));
//        }
//    }
//
//
//    public static void main(String[] args) throws Exception {
//        Configuration conf = new Configuration();
//        Job job = new Job(conf);
//        job.setJarByClass(WordCount.class);
//        //job.setJobName("wordcount");
//        job.setOutputKeyClass(Text.class);
//        job.setOutputValueClass(IntWritable.class);
//        job.setMapperClass(WordCountMap.class);
//        job.setReducerClass(WordCountReduce.class);
////        job.setInputFormatClass(TextInputFormat.class);
////        job.setOutputFormatClass(TextOutputFormat.class);
//        FileInputFormat.addInputPath(job, new Path(args[0]));
//        FileOutputFormat.setOutputPath(job, new Path(args[1]));
//        job.waitForCompletion(true);
//    }
//}
