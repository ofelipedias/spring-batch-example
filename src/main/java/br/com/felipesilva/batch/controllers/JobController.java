package br.com.felipesilva.batch.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/job")
@RestController
public class JobController {

    private final JobLauncher jobLauncher;

    private final Job personJob;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/execution")
    public void jobExecution() throws Exception {
        jobLauncher.run(personJob, new JobParameters());
    }
}
