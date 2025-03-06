
# Shape Calculation Program  

## Overview  
This Java program calculates the **area, perimeter, and volume** of different shapes using **Object-Oriented Programming (OOP) principles**. It includes an **abstract class (`Shape`)**, an **interface (`Volume`)**, and specific classes for different shapes.  

## Features  
- Calculates **area** and **perimeter** for:  
  - **Circle**  
  - **Rectangle**  
  - **Square**  
  - **Equilateral Pyramid (Square Base)**  
- Calculates **area and volume** for:  
  - **Sphere**  
  - **Cylinder**  
  - **Equilateral Pyramid (Square Base)**  

## Structure  
The program follows a **menu-driven approach** where users provide input, and the respective shape's calculations are performed.  

### **Classes and Files**  

| File Name     | Description |
|--------------|-------------|
| `Shape.java` | Abstract class defining basic shape properties and abstract methods for area & perimeter. |
| `Volume.java` | Interface that declares the `calculateVolume()` method for 3D shapes. |
| `Circle.java` | Implements `Shape` for Circle with methods to compute area and perimeter. |
| `Rectangle.java` | Implements `Shape` for Rectangle with methods to compute area and perimeter. |
| `Square.java` | Implements `Shape` for Square with methods to compute area and perimeter. |
| `Sphere.java` | Implements `Shape` and `Volume` for Sphere with methods for surface area & volume. |
| `Cylinder.java` | Implements `Shape` and `Volume` for Cylinder with methods for surface area & volume. |
| `Pyramid.java` | Implements `Shape` and `Volume` for Equilateral Pyramid with methods for surface area & volume. |
| `Main.java` | Main driver class that prompts user input and displays calculated results. |

## **How to Run the Program**  
1. **Clone the repository**:  
   ```sh
   git clone <your-repo-link>
   cd Shape-Calculation
