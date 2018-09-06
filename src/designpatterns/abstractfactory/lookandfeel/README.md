## Diagrama de Clases

![screenshot from 2018-09-06 10 09 07](https://user-images.githubusercontent.com/34853850/45159706-e8f36280-b1bd-11e8-8497-730d78bd451f.png)

### Ejemplo de ejecución con (WidgetDarkFactory)


public class Main {


    public static void main(String[] args) {

      WidgetFactory widgetFactory = new WidgetDarkFactory();

      new CalculatorWindow(widgetFactory);

    }
  
}

### Screenshot
![screenshot from 2018-09-06 10 21 17](https://user-images.githubusercontent.com/34853850/45160045-d0d01300-b1be-11e8-93a5-9fa75d31e3a8.png)

### Ejemplo de ejecución con (WidgetGreenFactory)


public class Main {


    public static void main(String[] args) {

      WidgetFactory widgetFactory = new WidgetGreenFactory();

      new CalculatorWindow(widgetFactory);

    }
  
}

### Screenshot
![screenshot from 2018-09-06 10 20 30](https://user-images.githubusercontent.com/34853850/45160040-cada3200-b1be-11e8-8957-dcc913518c1a.png)
