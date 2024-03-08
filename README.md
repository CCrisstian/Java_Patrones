<h1 align="center">Patrones de Diseño</h1>
<p>Los <b>'patrones de diseño'</b> son soluciones generales a problemas recurrentes que se encuentran comúnmente en el diseño de software. Estos patrones ofrecen soluciones probadas y eficientes para situaciones específicas y pueden ser utilizados para mejorar la estructura y modularidad del código. En Java, como en otros lenguajes de programación orientados a objetos, los patrones de diseño son herramientas poderosas para crear software más robusto y mantenible.</p>
<h3>Tipos de patrones:</h3>

-  `Patrones de creación`: tratan de la inicialización y configuración de clases y objetos
-  `Patrones estructurales`: Tratan de desacoplar interfaz e implementación de clases y objetos
-  `Patrones de comportamiento`: Tratan de las interacciones dinámicas entre sociedades de clases y objetos

<h3>Patrones de Creación</h3>

-  `Abstract Factory`. Proporciona una interfaz para crear familias de objetos o que dependen entre sí, sin especificar sus clases concretas.
-  `Builder`. Separa la construcción de un objeto complejo de su representación, de forma que el mismo proceso de construcción pueda crear diferentes representaciones.
-  `Factory Method`. Define una interfaz para crear un objeto, pero deja que sean las subclases quienes decidan qué clase instanciar. Permite que una clase delegue en sus subclases la creación de objetos.
-  `Prototype`. Especifica los tipos de objetos a crear por medio de una instancia prototípica, y crear nuevos objetos copiando este prototipo.
-  `Singleton`. Garantiza que una clase sólo tenga una instancia, y proporciona un punto de acceso global a ella.

<h3>Patrones Estructurales</h3>

-  `Adapter`. Convierte la interfaz de una clase en otra distinta que es la que esperan los clientes. Permiten que cooperen clases que de otra manera no podrían por tener interfaces incompatibles.
-  `Bridge`. Desvincula una abstracción de su implementación, de manera que ambas puedan variar de forma independiente.
-  `Composite`. Combina objetos en estructuras de árbol para representar jerarquías de parte-todo. Permite que los clientes traten de manera uniforme a los objetos individuales y a los compuestos.
-  `Decorator`. Añade dinámicamente nuevas responsabilidades a un objeto, proporcionando una alternativa flexible a la herencia para extender la funcionalidad.
-  `Facade`. Proporciona una interfaz unificada para un conjunto de interfaces de un subsistema. Define una interfaz de alto nivel que hace que el subsistema se más fácil de usar.
-  `Flyweight`. Usa el compartimiento para permitir un gran número de objetos de grano fino de forma eficiente.
-  `Proxy`. Proporciona un sustituto o representante de otro objeto para controlar el acceso a éste.

<h3>Patrones de Comportamiento</h3>

-  `Chain of Responsibility`. Evita acoplar el emisor de una petición a su receptor, al dar a más de un objeto la posibilidad de responder a la petición. Crea una cadena con los objetos receptores y pasa la petición a través de la cadena hasta que esta sea tratada por algún objeto.
-  `Command`. Encapsula una petición en un objeto, permitiendo así parametrizar a los clientes con distintas peticiones, encolar o llevar un registro de las peticiones y poder deshacer la operaciones.
-  `Interpreter`. Dado un lenguaje, define una representación de su gramática junto con un intérprete que usa dicha representación para interpretar las sentencias del lenguaje.
-  `Iterator`. Proporciona un modo de acceder secuencialmente a los elementos de un objeto agregado sin exponer su representación interna.
-  `Mediator`. Define un objeto que encapsula cómo interactúan un conjunto de objetos. Promueve un bajo acoplamiento al evitar que los objetos se refieran unos a otros explícitamente, y permite variar la interacción entre ellos de forma independiente.
-  `Memento`. Representa y externaliza el estado interno de un objeto sin violar la encapsulación, de forma que éste puede volver a dicho estado más tarde.
-  `Observer`. Define una dependencia de uno-a-muchos entre objetos, de forma que cuando un objeto cambia de estado se notifica y actualizan automáticamente todos los objetos.
-  `State`. Permite que un objeto modifique su comportamiento cada vez que cambia su estado interno. Parecerá que cambia la clase del objeto.
-  `Strategy`. Define una familia de algoritmos, encapsula uno de ellos y los hace intercambiables. Permite que un algoritmo varíe independientemente de los clientes que lo usan.
-  `Template Method`. Define en una operación el esqueleto de un algoritmo, delegando en las subclases algunos de sus pasos. Permite que las subclases redefinan ciertos pasos del algoritmo sin cambiar su estructura.
-  `Visitor`. Representa una operación sobre los elementos de una estructura de objetos. Permite definir una nueva operación sin cambiar las clases de los elementos sobre los que opera.

<h2 align="center">Singleton</h2>
<p align="center"><img width="500" alt="image" src="https://github.com/CCrisstian/Java_Patrones_de_Dise-o/assets/111469216/fac65c76-7d7e-4c6e-af52-936660b9666b"></p>
<p>El patrón de diseño <b>'Singleton'</b> es un patrón creacional que garantiza que una clase tenga solo una instancia y proporciona un punto de acceso global a esa instancia. Se utiliza cuando se quiere controlar el acceso a una única instancia de una clase y cuando esa instancia debe ser compartida entre múltiples partes del código.</p>
<p>Características del <b>'Singleton'</b>:</p>

-  <b>Constructor Privado</b>: El constructor de la clase es privado para evitar instanciaciones directas desde fuera de la clase.
-  <b>'Variable Estática Privada'</b>: Contiene la única instancia de la clase y se declara como estática y privada para que sea accesible solo desde métodos estáticos de la propia clase.
-  <b>'Método Estático de Acceso'</b>: Proporciona un método estático que actúa como punto de acceso global a la única instancia de la clase. Este método crea la instancia si aún no existe, o devuelve la instancia existente.

```java
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    // El constructor privado no permite que se genere un constructor por defecto.
    // (con mismo modificador de acceso que la definición de la clase) 
    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
```
<p>Notas Importantes:</p>

-  <b>'Inicialización Perezosa (Lazy Initialization')</b>: La implementación mostrada utiliza inicialización perezosa, creando la instancia solo cuando se solicita por primera vez. También es posible utilizar inicialización inmediata (eager initialization) si la instancia debe crearse al cargar la clase.
-  <b>'Seguridad en Hilos (Thread Safety)'</b>: La implementación presentada no es segura para hilos. Si la aplicación es multihilo, se deben agregar mecanismos de sincronización para garantizar que la creación de la instancia sea segura en entornos concurrentes.
-  <b>'Enum Singleton'</b>: A partir de Java 5, también puedes implementar el Singleton utilizando un enum, que proporciona una implementación segura para hilos y evita problemas relacionados con la serialización y la reflexión.

<p>El patrón <b>'Singleton'</b> es ampliamente utilizado para garantizar que solo haya una instancia de una clase en toda la aplicación, lo que puede ser útil para gestionar recursos compartidos y reducir la duplicación de instancias.</p>

<h2 align="center">Abstract Factory</h2>
<p>El patrón <b>'Abstract Factory'</b> es un patrón creacional que proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. Permite la creación de objetos relacionados sin especificar sus clases concretas, promoviendo así la independencia entre el cliente y las clases de implementación.</p>
<p align="center"><img width="800" alt="image" src="https://github.com/CCrisstian/Java_Patrones_de_Dise-o/assets/111469216/588dee39-1904-42b3-99fd-cfdb50cc4251"></p>
<p>Componentes clave del patrón <b>'Abstract Factory'</b>:</p>

-  `AbstractFactory`: Define una interfaz para operaciones que crean objetos `AbstractProducts`.
-  `ConcreteFactory`: Implementa las operaciones para crear objetos `ConcreteProducts`.
-  `Abstract Product`: Define una interfaz para un tipo de objeto `Product`.
-  `Concrete Product`: Define un objeto `Product` el cual es creado por el correspondiente `ConcreteFactory`, e implementa la interfaz de `AbstractProduct`.

<h2 align="center">Decorator</h2>
<p>El patrón <b>'Decorator'</b> es un patrón de diseño estructural que permite agregar nuevas funcionalidades a las clases sin modificar su estructura1. Este patrón se utiliza para agregar de forma dinámica nuevo comportamiento o funcionalidades a la clase principal.</p>
<p align="center"><img width="800" alt="image" src="https://github.com/CCrisstian/Java_Patrones_de_Dise-o/assets/111469216/da991fef-26e2-4f89-ba7c-974e489ab127"></p>

Las partes principales del patrón `Decorator` son:

-  `Componente`: Deﬁne la interfaz para los objetos que pueden tener responsabilidades añadidas.
-  `Componente Concreto`: Deﬁne un objeto al cual se le pueden agregar responsabilidades adicionales.
-  `Decorador`: Mantiene una referencia al componente asociado. Implementa la interfaz de la superclase Componente delegando en el componente asociado.
-  `Decorador Concreto`: Añade responsabilidades al componente.
