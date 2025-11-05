<p align='center'> 
  <img src="https://capsule-render.vercel.app/api?type=waving&height=200&color=80354A&text=Patrones%20de%20Dise%C3%B1o&fontColor=FFFFFF&desc=Resumen%20Te%C3%B3rico%20y%20Ejemplos%20(2025-2)&fontAlignY=30&descAlignY=54"/> 
</p>
<p align='center'>
  <img src="https://64.media.tumblr.com/53f3cdf8dd188057a8b0e8fad785483a/9883ef562fd81608-f0/s540x810/945f13364c67c4c79b5672ae72e6f13c409c17f5.gifv" alt="Misa Amane Death Note" />
</p>
<p align='center'>
    <img 
        src="https://capsule-render.vercel.app/api?type=rect&height=5&color=80354A&reversal=false&fontAlignY=40&fontColor=FFFFFF&fontSize=60"
    />
</p>

### Descripción

Los **patrones de diseño** son estrategias reutilizables y probadas que resuelven problemas habituales en desarrollo de software. No son clases ni librerías, sino moldes para organizar el código y facilitar la mantenibilidad y evolución de los proyectos.

***

### Clasificación

- **Patrones creacionales:** Mecanismos para la creación de objetos, mejorando la flexibilidad y la reutilización.
- **Patrones estructurales:** Indican cómo unir objetos y clases en estructuras amplias, manteniendo eficiencia y flexibilidad.
- **Patrones de comportamiento:** Gestionan la comunicación efectiva y la asignación de responsabilidades entre objetos.

<p align='center'>
    <img 
        src="https://capsule-render.vercel.app/api?type=rect&height=5&color=80354A&reversal=false&fontAlignY=40&fontColor=FFFFFF&fontSize=60"
    />
</p>

### Patrones creacionales

Se centran en cómo se crean las instancias de objetos para garantizar control, flexibilidad y reutilización.

#### Singleton

**Propósito:** Permite que una clase tenga solo una instancia y provee acceso global a ella.

**Casos de uso:**
- Gestores de conexión a base de datos
- Gestión de parámetros de configuración
- Logs y cachés

**Paso a paso:**
1. **Añade un campo estático privado a la clase para la instancia Singleton**  
   ```java
   private static DeathNote deathNote;
   ```
2. **Define un método estático público para obtener la instancia**
   ```java
   public static DeathNote getInstance(String owner){
       if (deathNote == null) {
           deathNote = new DeathNote(owner);
       }
       return deathNote;
   }
   ```
3. **Inicializa la instancia dentro del método estático**
   - Si por primera vez Light Yagami accede al Death Note, se crea la libreta y se le asigna como dueño
4. **Declara el constructor como privado**
   ```java
   private DeathNote(String owner){
       this.owner = owner;
   }
   ```
5. **Utiliza el método estático en tu código cliente**
   ```java
   DeathNote lightLibreta = DeathNote.getInstance("Light Yagami");
   DeathNote misaLibreta = DeathNote.getInstance("Misa Amane");
   System.out.println(lightLibreta.owner); // "Light Yagami"
   System.out.println(misaLibreta.owner);  // "Light Yagami"
   ```
   Ambos acceden a la misma instancia de la libreta

***

#### Factory Method

**Propósito:** Define una interfaz para crear un objeto, dejando que las subclases decidan qué clase instanciar.

**Elementos:**
- Producto (Interfaz común)
- Productos concretos (Implementaciones)
- Creador (Clase abstracta/interfaz con método de fábrica)
- Creador concreto (Subclases que devuelven la instancia correcta)

**Paso a paso:**
1. **Define una interfaz para los productos**
   ```java
   public interface Investigador {
       void investigarCaso(String caso);
   }
   ```
2. **Implementa las clases concretas**
   ```java
   public class L implements Investigador {
       public void investigarCaso(String caso){
           System.out.println("L investiga: " + caso);
       }
   }

   public class Near implements Investigador {
       public void investigarCaso(String caso){
           System.out.println("Near investiga: " + caso);
       }
   }
   ```
3. **Crea la clase abstracta de la fábrica**
   ```java
   public abstract class EquipoInvestigacion {
       public abstract Investigador crearInvestigador();
       public void asignarCaso(String caso){
           Investigador investigador = crearInvestigador();
           investigador.investigarCaso(caso);
       }
   }
   ```
4. **Implementa las fábricas concretas**
   ```java
   public class EquipoL extends EquipoInvestigacion {
       public Investigador crearInvestigador(){
           return new L();
       }
   }

   public class EquipoNear extends EquipoInvestigacion {
       public Investigador crearInvestigador(){
           return new Near();
       }
   }
   ```
   Así se pueden crear distintos equipos según el líder

<p align='center'>
    <img 
        src="https://capsule-render.vercel.app/api?type=rect&height=5&color=80354A&reversal=false&fontAlignY=40&fontColor=FFFFFF&fontSize=60"
    />
</p>

### Patrones de comportamiento

Gestionan cómo los objetos interactúan y asignan responsabilidades para facilitar el mantenimiento y la evolución.

#### Strategy

**Propósito:** Permite elegir entre distintos algoritmos en tiempo de ejecución mediante el uso de interfaces y clases concretas.

**Elementos:**
- Interfaz de estrategia
- Estrategias concretas (implementaciones)
- Contexto que almacena la referencia y permite cambiar la estrategia

**Paso a paso:**
1. **Declara la interfaz de estrategia**
   ```java
   public interface Plan {
       String ejecutarPlan(String objetivo);
   }
   ```
2. **Crea clases concretas para cada algoritmo**
   ```java
   public class PlanLight implements Plan {
       public String ejecutarPlan(String objetivo){
           return "Escribir el nombre de " + objetivo + " en la Death Note";
       }
   }

   public class PlanL implements Plan {
       public String ejecutarPlan(String objetivo){
           return "Colocar cámaras ocultas para descubrir a " + objetivo;
       }
   }
   ```
3. **Añade un campo en el contexto para almacenar la estrategia**
   ```java
   public class Tactica {
       private Plan plan;
       public Tactica(Plan plan){
           this.plan = plan;
       }
       public void cambiarPlan(Plan nuevoPlan){
           this.plan = nuevoPlan;
       }
       public void ejecutar(String objetivo){
           System.out.println(plan.ejecutarPlan(objetivo));
       }
   }
   ```
4. **Proporciona un método para cambiar la estrategia**
   ```java
   tactica.cambiarPlan(new PlanL());
   ```
5. **Utiliza la estrategia en los métodos del contexto**
   ```java
   Tactica tacticaLight = new Tactica(new PlanLight());
   tacticaLight.ejecutar("L");       // Escribir el nombre de L en la Death Note

   tacticaLight.cambiarPlan(new PlanL());
   tacticaLight.ejecutar("Light");   // Colocar cámaras ocultas para descubrir a Light


***

#### Observer

**Propósito:** Define una dependencia uno-a-muchos, donde los observadores reciben notificaciones automáticas de cambios en el objeto observado.

**Elementos:**
- Sujeto (objeto observado)
- Observador (interfaz con método de actualización)
- Sujeto concreto (con lógica de notificación)
- Observador concreto (qué hacer con la notificación)

**Paso a paso:**
1. **Declara la interfaz para los observadores**
   ```java
   public interface ShinigamiObserver {
       void notificarCambio(String propietario, String evento);
   }
   ```
2. **Implementa observadores concretos**
   ```java
   public class Ryuk implements ShinigamiObserver {
       public void notificarCambio(String propietario, String evento){
           System.out.println("Ryuk observa: " + propietario + " ha realizado " + evento);
       }
   }

   public class Rem implements ShinigamiObserver {
       public void notificarCambio(String propietario, String evento){
           System.out.println("Rem observa: " + propietario + " ha realizado " + evento);
       }
   }
   ```
3. **Implementa la clase sujeto con manejo de lista de observadores**
   ```java
   import java.util.List;
   import java.util.ArrayList;

   public class DeathNoteLibreta {
       private List<ShinigamiObserver> shinigamis = new ArrayList<>();
       private String owner;
       public DeathNoteLibreta(String owner){
           this.owner = owner;
       }
       public void escribirNombre(String nombre){
           System.out.println(owner + " escribió " + nombre + " en la Death Note");
           notificar("Escribir nombre: " + nombre);
       }
       private void notificar(String evento){
           for (ShinigamiObserver s : shinigamis){
               s.notificarCambio(owner, evento);
           }
       }
   }
   ```
4. **Crea métodos para añadir y quitar observadores**
   ```java
   public void agregarShinigami(ShinigamiObserver s){
       shinigamis.add(s);
   }
   public void quitarShinigami(ShinigamiObserver s){
       shinigamis.remove(s);
   }
   ```
5. **Notifica a todos los observadores cuando ocurra un evento**
   ```java
   DeathNoteLibreta libreta = new DeathNoteLibreta("Light");
   ShinigamiObserver ryuk = new Ryuk();
   ShinigamiObserver rem = new Rem();

   libreta.agregarShinigami(ryuk);
   libreta.agregarShinigami(rem);

   libreta.escribirNombre("L"); // Ryuk y Rem reciben la notificación
   ```

<p align='center'>
    <img 
        src="https://capsule-render.vercel.app/api?type=rect&height=5&color=80354A&reversal=false&fontAlignY=40&fontColor=FFFFFF&fontSize=60"
    />
</p>
