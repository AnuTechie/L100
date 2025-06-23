1. FACTORY PATTERN :<br>
   ----------------
The Factory Pattern is a design pattern that helps create objects without exposing the exact class being used. It provides a way to delegate the object creation to a separate method or class.<br>
USE CASE:<br>
In this project, we simulate a real-world system where a bank needs to send notifications through different channels like Email, SMS, and Push.
Each type of notification has its own behavior but shares a common interface.
Based on the type required, the appropriate notification is created and used. This makes the code easy to extend if new types like WhatsApp are added later.<br>
WHY FACTORY PATTERN?<br>
We use the Factory Pattern here so that the rest of the code doesn't need to know how each notification type is created.
The factory handles that logic, and just returns the right object. 
This avoids repeated new statements and keeps everything centralized. It also follows good design principles by promoting separation of concerns.

2. SINGLETON PATTERN:<br>
   ------------------
The Singleton Pattern ensures that only one instance of a class is created and provides a global point of access to it. It's commonly used for classes that manage shared resources or centralized services.<br>
USE CASE:<br>
In this project, we have a UniqueIdService that generates IDs for orders and users. Since ID generation should be consistent and sequential, we must ensure only one instance manages it. Both OrderService and UserService use this service to assign unique IDs. This avoids conflicts and ensures ID values do not repeat or overlap.<br>
WHY SINGLETON PATTERN:<br>
The Singleton Pattern is used here to guarantee that only one ID generator exists throughout the application. It provides a central place to control how IDs are created. This avoids bugs from multiple generators producing duplicate or out-of-order IDs. It also keeps the logic simple and consistent across all services.

3. ABSTRACTFACTORY PATTERN:<br>
   ------------------------
The Abstract Factory Pattern is used to create families of related objects without specifying their exact classes. It lets you produce different variants of objects (like buttons, checkboxes, etc.) that are meant to be used together, keeping the code clean and consistent.<br>
USE CASE:<br>
This project simulates a user interface system where components (like buttons and checkboxes) need to change based on the selected theme — Light or Dark. Each theme has its own style of buttons and checkboxes. Instead of manually creating them, we use abstract factories (LightThemeFactory or DarkThemeFactory) that handle object creation. The client code just asks for a factory and gets the correct components for that theme.<br>
WHY ABSTRACTFACTORY PATTERN:<br>
This pattern is ideal here because we are dealing with groups of related components. We don't want the main application to care about which specific class (like LightButton or DarkCheckbox) is being used. The abstract factory handles that decision. This makes it easy to add new themes in the future without touching the client code — just create a new factory and new component classes.

4. BUILDER PATTERN:<br>
   ----------------
The Builder Pattern is a design pattern used to construct complex objects step by step. Instead of creating an object in one go, it allows you to build it piece by piece while keeping the creation logic separate from the object structure.<br>
USE CASE:<br>
This project demonstrates building different types of robots — like humanoid robots and industrial robots. Each robot has multiple parts (head, body, arms, legs), and the way these parts are built depends on the robot type. The building steps are defined by a common interface, and a director class controls how the robot is assembled. The final robot is printed after all parts are set.<br>
WHY BUILDER PATTERN:<br>
This pattern is used here because robot construction involves multiple steps, and the process varies depending on the type of robot. By separating the building logic from the product, we keep the code clean and flexible. It also makes it easy to create new robot types in the future without changing the core structure or director code.

