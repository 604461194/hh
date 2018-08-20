package com.example.demo.controller;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.ScheduleBuilder;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.example.demo.job.HelloJob;

public class TestQuartz {

	public static void main(String[] args) throws SchedulerException {
		//获取Scheduler对象引用
		SchedulerFactory sched=new StdSchedulerFactory();
		Scheduler scheduler=sched.getScheduler();
		
		
		//定义job任务
		JobDetail jobDetail=JobBuilder.newJob(HelloJob.class)
				.withIdentity("job 1")//任务名称
				.build();
		
		
		//定义触发器Trigger定义时间规则，并设置启动时间
		CronTrigger cronTrigger=TriggerBuilder.newTrigger().withIdentity("Trigger 1")
				.withSchedule(
						CronScheduleBuilder.cronSchedule("0/2 * * * * ? *")
						)
				.startNow()//启动时间，立即启动
				.build();
		
		
		// 使用调度将触发器和任务关联起来
		scheduler.scheduleJob(jobDetail, cronTrigger);
		
		//启动
		scheduler.start();
	}
}
