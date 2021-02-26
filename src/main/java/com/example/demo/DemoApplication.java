package com.example.demo;

import com.example.demo.domain.Comment;
import com.example.demo.domain.Link;
import com.example.demo.repository.CommentRepository;
import com.example.demo.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Welcome Anand ");
	}


	//@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository ) {
		return args -> {
			Link link = new Link("Getting started spring boot2", "www.example.com");
			linkRepository.save(link);

			Comment comment =  new Comment("spring 2 link awesome",link);
			commentRepository.save(comment);
			link.AddComment(comment);


			System.out.println("add link and title");
			System.out.println("+++++++++++++++++++++++");

//			Link firstLink = linkRepository.findByTitle("Getting started spring boot2");
//			System.out.println(firstLink.getTitle());

		};

	}
}
