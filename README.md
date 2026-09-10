# 💱 Currency Converter (Java CLI)

A dynamic, console-based currency conversion application built in Java, featuring real-time exchange rates from an external REST API and JSON parsing.

## 🚀 Features
- **Real-Time Exchange Rates:** Connects dynamically to ExchangeRate-API for live currency values worldwide (USD, BRL, EUR, JPY, GBP, etc.).
- **JSON Parsing:** Integrated Google's `Gson` library to parse API response payloads cleanly.
- **OOP Architecture:** Clear separation of concerns between CLI user interaction (`CurrencyConverter`) and business logic (`ExchangeService`).
- **HTTP Client Integration:** Native `java.net.http.HttpClient` implementation for making web requests.

## 🛠️ Tech Stack & Dependencies
- **Language:** Java 17+
- **IDE:** IntelliJ IDEA
- **Library:** Google Gson (JSON parser)
- **API:** ExchangeRate-API

## 📁 Project Structure
```text
src/
├── CurrencyConverter.java   # Main entry point & CLI interaction
└── ExchangeService.java     # HTTP requests, API integration & Gson parsing

How to Run
Open the project in IntelliJ IDEA.

Ensure the Gson library (com.google.code.gson:gson:2.10.1) is added to dependencies.

Run CurrencyConverter.java.

Usage Example

=== CURRENCY CONVERTER ===
Enter base currency (e.g. USD, EUR, BRL): 
USD
Enter target currency (e.g. BRL, USD, EUR): 
BRL
Enter the amount you want to convert: 
100
Converting USD 100.0 to BRL...
Result: 593.15 BRL
