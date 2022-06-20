package com.example.Bank;

import com.example.Bank.controller.AccountController;
import com.example.Bank.controller.BankController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ExceptionHandler;
import practice.dto.AccountRequestDto;
import practice.dto.BankRequestDto;
import practice.repository.AccountRepositoryImpl;
import practice.repository.BankRepositoryImpl;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

@SpringBootApplication
public class BankApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankApplication.class, args);
		Handler handler=new Handler() {
			@Override
			public void publish(LogRecord record) {

			}

			@Override
			public void flush() {

			}

			@Override
			public void close() throws SecurityException {

			}
		};

		//Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) handler);



	}

}
