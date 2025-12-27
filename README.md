# Laptop Dealer Project (Setter Injection)

This is a **Spring Framework project** demonstrating **Dependency Injection (DI)** using **Setter Injection**.  
The project allows a user to select a **Laptop brand** and **Processor type**, and Spring injects the required dependency automatically.

---

## 🧠 Concept

### Dependency Injection
- Dependency Injection (DI) is a design pattern where the **dependencies of a class are provided externally** instead of being created inside the class.  
- In this project, a `LaptopBrand` depends on a `Processor`.  
- We inject the `Processor` into the `LaptopBrand` using **setter injection**.

### Setter Injection
- The **dependency** is provided via a **setter method**.  
- Spring XML `<property>` tag is used to inject the dependency.  
- Example:
```xml
<bean id="dellwithi3" class="com.example.LaptopDealerWithSetter.Dell">
    <property name="processors" ref="i3"/>
</bean>
````

---

## 💻 Project Structure

```
LaptopDealerWithSetter/
├─ src/main/java/com/example/LaptopDealerWithSetter/
│  ├─ Dell.java
│  ├─ MacBook.java
│  ├─ MicrosoftLaptop.java
│  ├─ I3.java
│  ├─ I5.java
│  ├─ I7.java
│  ├─ LaptopBrand.java
│  ├─ Processors.java
│  └─ LaptopDealerWithSetterApplication.java
├─ src/main/resources/applicationContext.xml
├─ .gitignore
└─ README.md
```

---

## ⚙️ How It Works

1. User runs the application:

```bash
java -jar LaptopDealerWithSetterApplication
```

2. User selects **brand**:

* Dell
* MacBook
* Microsoft Laptop

3. User selects **processor**:

* i3
* i5
* i7

4. Spring injects the **selected Processor** into the **selected LaptopBrand** using **setter injection**.

5. Program displays:

```
You have selected Dell laptop With i5 processor
```

---

## 📌 Key Points

* Dependencies (`Processors`) are **not created inside the laptop classes**.
* **Setter injection** makes dependencies optional and flexible.
* Beans are defined in `applicationContext.xml` and referenced via **id**.
* This demonstrates **Spring’s IoC (Inversion of Control) container**.

---

## 🛠️ Technologies Used

* Java 17+
* Spring Framework (Core)
* Maven (optional for build management)
* IDE: IntelliJ / STS / VS Code

---

## 🚀 How to Run

1. Clone the repository:

```bash
git clone https://github.com/yourusername/LaptopDealerWithSetter.git
```

2. Open in your IDE.

3. Run `LaptopDealerWithSetterApplication.java`.

4. Follow console prompts to select **brand** and **processor**.
