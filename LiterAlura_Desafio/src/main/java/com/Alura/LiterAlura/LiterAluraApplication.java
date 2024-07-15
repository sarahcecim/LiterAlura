package com.Alura.LiterAlura;

import com.Alura.LiterAlura.repositories.AutorRepository;
import com.Alura.LiterAlura.repositories.LivrosRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.concurrent.CompletionException;




@SpringBootApplication
public class LiterAluraApplication {

		static Object LivroGet() {

		Scanner scanner = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Insira o nome do livro que deseja procurar");

		String Nome = scanner.nextLine();


		String API_URL = "https://gutendex.com/books/?search=" + Nome.replace(" ", "%20");


		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API_URL)).build();
		HttpResponse<String> response = null;

		try {
			response = client.send(request, HttpResponse.BodyHandlers.ofString());
			if (response.statusCode() == 200) {
				String responseBody = response.body();

				ObjectMapper mapper = new ObjectMapper();
				JsonNode node = mapper.readTree(responseBody);
				//String locatedNode = String.valueOf(node.get("results").get(0).get("title"));

				System.out.println("----- LIVRO -----");
				System.out.println("Titulo: " + node.get("results").get(0).get("title"));
				System.out.println("Autor: " +node.get("results").get(0).get("author"));
				System.out.println("Idioma: " + node.get("results").get(0).get("languages"));
				System.out.println("Downloads: " + node.get("results").get(0).get("download_count"));
				System.out.println("-----------------");

				return node;

			} else {
				System.out.println("Erro:" + response.statusCode());
			}

		} catch (IOException | InterruptedException e) {
			throw new CompletionException(e);
		}

		return null;
	}

		static String getAno() {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Insira o ano que deseja pesquisar");

            return scanner.nextLine();
		};

		static String getLang() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insira o idioma para realizar a busca: ");
		System.out.println("es- espanhol");
		System.out.println("en- english");
		System.out.println("fr- frances");
		System.out.println("pr- portugues");


		return scanner.nextLine();
	};

	public static void main(String[] args) {
		SpringApplication.run(LiterAluraApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AutorRepository autorRepository, LivrosRepository livrosRepository) {
		return args -> {

			Scanner scanner = new Scanner(System.in);  // Create a Scanner object

			System.out.println("Escolha o número de sua opção");
			System.out.println("1- Buscar livros pelo titulo");
			System.out.println("2- Listar livros registrados");
			System.out.println("3- Listar autores registrados");
			System.out.println("4- Listar autores vivos em um determinado ano");
			System.out.println("5- Listar livros em um determinado idioma");
			System.out.println("0- Sair");

			int option = scanner.nextInt();

			if (option == 1) {
				LivroGet();
			};
			if (option == 2) {
				System.out.println(livrosRepository.findAll().get(0).toString());
			};
			if (option == 3) {
				System.out.println(autorRepository.findAll().get(0).toString());
			}
			if (option == 4) {
				String ano = getAno();
				System.out.println(ano);
				System.out.println(autorRepository.findAutoresByDtFalecimento(ano).get(0).toString());
			}
			if (option == 5) {
				String ano = getLang();
				System.out.println(ano);
				System.out.println(livrosRepository.findLivroByLanguage(ano).get(0).toString());
			}
			if (option == 0) {
				System. exit(0);
			}



		};

		};
	}
