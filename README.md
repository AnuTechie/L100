1. FACTORY PATTERN :
The Factory Pattern is a design pattern that helps create objects without exposing the exact class being used. It provides a way to delegate the object creation to a separate method or class.
USE CASE:
In this project, we simulate a real-world system where a bank needs to send notifications through different channels like Email, SMS, and Push.
Each type of notification has its own behavior but shares a common interface.
Based on the type required, the appropriate notification is created and used. This makes the code easy to extend if new types like WhatsApp are added later.
WHY FACTORY PATTERN?
We use the Factory Pattern here so that the rest of the code doesn't need to know how each notification type is created.
The factory handles that logic, and just returns the right object. 
This avoids repeated new statements and keeps everything centralized. It also follows good design principles by promoting separation of concerns.
