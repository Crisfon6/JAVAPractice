package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
	public static void main(String args[]) {
//		// creacion partes computadora
//		Monitor monitorToshiba = new Monitor("Toshiba", 13);
//		Monitor monitorDell = new Monitor("Dell", 15);
//		Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
//		Teclado tecladoDell = new Teclado("usb", "Dell");
//		Raton ratonToshi = new Raton("bluetooth", "Toshiba");
//		Raton ratonDell = new Raton("usb", "Dell");
//		// creacion computadora
//		Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshiba, tecladoToshi, ratonToshi);
//		Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);
//		Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);
//		
//		Orden orden1 = new Orden();
//		
//		//crear orden y agreagar compus a la orden
////		orden1.agregarComputador(compuToshiba);
//		orden1.agregarComputador(compuDell);
//		orden1.agregarComputador(compuArmada);
//		
//		//Imprimir la orden
//		orden1.mostrarOrden();
//		
//		 //Agregamos una segunda orden
//        Orden orden2 = new Orden();
//        orden2.agregarComputador(compuArmada);
//        orden2.agregarComputador(compuDell);
//        System.out.println("");
//        orden2.mostrarOrden();}
		//creacion de computadora Toshiba
        Monitor monitorToshi = new Monitor("Toshiba", 13);
        Teclado tecladoToshi = new Teclado("bluetooth", "Toshiba");
        Raton ratonToshi = new Raton("bluetooth", "Toshiba");
        Computadora compuToshiba = new Computadora("Computadora Toshiba", monitorToshi, tecladoToshi, ratonToshi);

        //creacion de computadora dell
        Monitor monitorDell = new Monitor("Dell", 15);
        Teclado tecladoDell = new Teclado("usb", "Dell");
        Raton ratonDell = new Raton("usb", "Dell");
        Computadora compuDell = new Computadora("Computadora Dell", monitorDell, tecladoDell, ratonDell);

        //creacion de computadora armada
        Computadora compuArmada = new Computadora("Computadora Armada", monitorDell, tecladoToshi, ratonToshi);

        //Agregamos las computadoras a la orden 
        Orden orden1 = new Orden();
        orden1.agregarComputadora(compuToshiba);
        orden1.agregarComputadora(compuDell);
        orden1.agregarComputadora(compuArmada);
        //Imprimimos la orden
        orden1.mostrarOrden();
        
        //Agregamos una segunda orden
        Orden orden2 = new Orden();
        orden2.agregarComputadora(compuArmada);
        orden2.agregarComputadora(compuDell);
        System.out.println("");
        orden2.mostrarOrden();
	}

}
