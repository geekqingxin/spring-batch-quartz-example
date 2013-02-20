/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ilya40umov.batch.mains;

import org.ilya40umov.batch.configurations.BatchScheduledProcessesConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ilya40umov
 */
public class BatchScheduledProcessesRunner
{
    private final ApplicationContext appCtx;

    public BatchScheduledProcessesRunner()
    {
        super();
        appCtx = new AnnotationConfigApplicationContext(BatchScheduledProcessesConfiguration.class);
    }

    public static void main(String[] args)
    {
        BatchScheduledProcessesRunner batchScheduledProcessesRunner = new BatchScheduledProcessesRunner();
        batchScheduledProcessesRunner.invoke();
    }

    public void invoke()
    {
        while (!Thread.currentThread().isInterrupted())
        {
            try
            {
                Thread.sleep(1000L);
            } catch (InterruptedException e)
            {
                Thread.interrupted();
            }
        }
    }
}