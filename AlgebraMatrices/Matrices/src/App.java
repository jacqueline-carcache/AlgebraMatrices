public class App{
    public static void main(String args[]){

        //declaracion de la variable que permite saber si el usuario desea repetir el programa
        int repetir = 0;

        // Declaro la matriz fuera del bucle para evitar errores 
        int[][] matriz_A = new int[2][2]; // matriz_1 para la suma 
        int[][] matriz_B = new int[2][2]; // matriz_2 para la suma
        int[][] matriz_C = new int[2][2]; // matriz_C para la matriz escalar
        int[][] matriz_D = new int[2][2]; // matriz_1 para la igualdad de matriz 
        int[][] matriz_E = new int[2][2]; // matriz_2 para la igualdad de matriz
        int[][] matriz_F = new int[2][2]; // matriz_1 para la resta 
        int[][] matriz_G = new int[2][2]; // matriz_2 para la resta

        int[][] matriz_Suma = new int[2][2]; 
        int[][] matriz_Cero = new int[2][2]; 
        int[][] matriz_Escalar = new int[2][2]; 
        int[][] matriz_Resta = new int[2][2]; 
        int[][] matriz_Identidad = new int[2][2];

        // Estructura de control repetitiva do-while para repetir el programa (si!=0/no=1) 
        do 
        { 
            // Menú de opciones 
            System.out.println("Menú de opciones:"); 
            System.out.println("1. Sumar 2 matrices."); 
            System.out.println("2. Verificar si 2 matrices son iguales o no."); 
            System.out.println("3. Generar una matriz 0 de n x m.");
            System.out.println("4. Restar dos matrices."); 
            System.out.println("5. Multiplicar un escalar por una matriz de n x m."); 
            System.out.println("6. Obtener una matriz identidad de tamaño n"); 
            System.out.println();

            // Declaración de variables para la opción del menú y determinar el N° Intentos int opcion_menu; int intentos_menu = 0;
            int opcion_menu;
            int intentos_menu = 0;

            // Ciclo do-while para validar que la opción esté dentro del rango y permita solo 3 intentos 
            do 
            { 
                System.out.println("Seleccione una de las opciones:"); 
                opcion_menu = Integer.parseInt(System.console().readLine()); 
                // Asignación de la variable opción 
                intentos_menu = intentos_menu + 1; 
            } while ((opcion_menu < 1 || opcion_menu > 6) && intentos_menu < 3); 
            System.out.println();

            // Limpiar el menú System.out.print(“\033[H\033[2J”); 
            System.out.flush();

            // Estructura de control condicional if-else que verifique si el usuario excedió su número de intentos 
            if (intentos_menu >= 3) 
            { 
                System.out.print("Lo siento, el máximo son tres intentos"); 
            } 
            else 
            { 
                // Declaración de variables filas y columnas para todas las matrices 
                int filas_1 = 0; 
                int columnas_1 = 0; 
                int filas_2 = 0; 
                int columnas_2 = 0;

                switch (opcion_menu) { 
                    case 1: 
                        { 
                            // Mensaje para mostrar la opción seleccionada 
                            System.out.println("1. Sumar 2 matrices iguales."); 
                            System.out.println();

                            // Declarar variables para los intentos
                            int intentos_suma1 = 0;
                            int intentos_suma2 = 0;

                            int intentos_suma3 = 0;
                            int intentos_suma4 = 0;

                            // Validación de filas y columnas para evitar datos incorrectos
                            do {
                                System.out.println("Matriz_1: Ingrese la cantidad de filas:");
                                filas_1 = Integer.parseInt(System.console().readLine());
                                intentos_suma1 = intentos_suma1 + 1;
                            } while (filas_1 <= 0 && intentos_suma1 < 3);

                            if (filas_1 > 0 && intentos_suma1 <= 3) {

                                do {
                                    System.out.println("Matriz_1: Ingrese la cantidad de columnas:");
                                    columnas_1 = Integer.parseInt(System.console().readLine());
                                    intentos_suma2 = intentos_suma2 + 1;
                                } while (columnas_1 <= 0 && intentos_suma2 < 3);

                                if (columnas_1 > 0 && intentos_suma2 <= 3) {

                                    // Modifico las dimensiones de la matriz
                                    matriz_A = new int[filas_1][columnas_1];

                                    // Mismo proceso para la matriz_2
                                    do {
                                        System.out.println("Matriz_2: Ingrese la cantidad de filas:");
                                        filas_2 = Integer.parseInt(System.console().readLine());
                                        intentos_suma3 = intentos_suma3 + 1;
                                    } while (filas_2 <= 0 && intentos_suma3 < 3);

                                    if (filas_2 > 0 && intentos_suma3 <= 3) 
                                    { 
                                        do { 
                                            System.out.println("Matriz_2: Ingrese la cantidad de columnas:"); 
                                            columnas_2 = Integer.parseInt(System.console().readLine()); 
                                            intentos_suma4 = intentos_suma4 + 1; 
                                        } while (columnas_2 <= 0 && intentos_suma4 < 3);
                                        
                                        if (columnas_2 > 0 && intentos_suma4 <= 3) {
                                            matriz_B = new int[filas_2][columnas_2];
                                            System.out.print("\033[H\033[2J");
                                            System.out.flush();

                                            if (filas_1 == filas_2 && columnas_1 == columnas_2) {
                                                // Declarar variable índice para mostrar al usuario la ubicación exacta
                                                int indice_A = 1;

                                                // Ciclo for para recorrer toda la matriz
                                                for (int i = 0; i < filas_1; i++) {
                                                    for (int j = 0; j < columnas_1; j++) {
                                                        System.out.println("Matriz_1: Digite el valor_" + indice_A + ": ");
                                                        matriz_A[i][j] = Integer.parseInt(System.console().readLine());
                                                        indice_A++;
                                                    }
                                                }
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();

                                                int indice_B = 1;
                                                for (int i = 0; i < filas_2; i++) {
                                                    for (int j = 0; j < columnas_2; j++) {
                                                        System.out.println("Matriz_2: Digite el valor_" + indice_B + ": ");
                                                        matriz_B[i][j] = Integer.parseInt(System.console().readLine());
                                                        indice_B++;
                                                    }
                                                }
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                            
                                                // La matriz suma se encargará de guardar los valores 
                                                matriz_Suma = new int[filas_1][columnas_1];

                                                // Ciclo for para sumar cada valor correspondiente 
                                                for (int i = 0; i < filas_1; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_1; j++) 
                                                    { 
                                                        matriz_Suma[i][j] = matriz_A[i][j] + matriz_B[i][j]; 
                                                    } 
                                                }

                                                // Ciclo for para mostrar todas las matrices 
                                                System.out.println("Matriz_A"); 
                                                for (int i = 0; i < filas_1; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_1; j++) 
                                                    { 
                                                        System.out.print(matriz_A[i][j] + " "); 
                                                    } 
                                                    System.out.println(); 
                                                }

                                                System.out.println("Matriz_B"); 
                                                for (int i = 0; i < filas_2; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_2; j++) 
                                                    { 
                                                        System.out.print(matriz_B[i][j] + " "); 
                                                    } 
                                                    System.out.println(); 
                                                }

                                                System.out.println("Matriz_Suma"); 
                                                for (int i = 0; i < filas_1; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_1; j++) 
                                                    { 
                                                        System.out.print(matriz_Suma[i][j] + " "); 
                                                    } 
                                                    System.out.println(); 
                                                } 
                                            } 
                                            else 
                                            { 
                                                System.out.println("Las dimensiones de ambas matrices no coinciden entre sí."); 
                                            }
                                        } 
                                        else 
                                        { 
                                            System.out.println("Intentos agotados"); 
                                        }
                                    }
                                    else 
                                    { 
                                        System.out.println("Intentos agotados"); 
                                    }
                                }
                                else 
                                { 
                                    System.out.println("Intentos agotados"); 
                                }
                            }
                            else 
                            { 
                                System.out.println("Intentos agotados"); 
                            }

                            break; 
                        }
                    case 2: 
                        { 
                            System.out.println("2. Verificar si 2 matrices son iguales o no."); 
                            System.out.println();

                            // Declaración de variable tipo booleano para saber si ambas matrices son iguales entre sí
                            boolean igualdad = false;

                            // Declaración de variables para los intentos
                            int intentos_Igualdad1 = 0;
                            int intentos_Igualdad2 = 0;

                            int intentos_Igualdad3 = 0;
                            int intentos_Igualdad4 = 0;

                            // Ciclo do-while para definir las dimensiones de la matriz 1
                            do {
                                System.out.println("Matriz_1: Ingrese la cantidad de filas:");
                                filas_1 = Integer.parseInt(System.console().readLine());
                                intentos_Igualdad1 = intentos_Igualdad1 + 1;
                            } while (filas_1 <= 0 && intentos_Igualdad1 < 3);

                            if (filas_1 > 0 && intentos_Igualdad1 <= 3) 
                            { 
                                do { 
                                    System.out.println("Matriz_1: Ingrese la cantidad de columnas:"); 
                                    columnas_1 = Integer.parseInt(System.console().readLine()); 
                                    intentos_Igualdad2 = intentos_Igualdad2 + 1; 
                                } while (columnas_1 <= 0 && intentos_Igualdad2 < 3);
                                
                                if (columnas_1 > 0 && intentos_Igualdad2 <= 3) {
                                    // Declarar las dimensiones de la matriz 1 de igualdad
                                    matriz_D = new int[filas_1][columnas_1];

                                    System.out.println();

                                    // Ciclo para definir las dimensiones de la matriz 2
                                    do {
                                        System.out.println("Matriz_2: Ingrese la cantidad de filas:");
                                        filas_2 = Integer.parseInt(System.console().readLine());
                                        intentos_Igualdad3 = intentos_Igualdad3 + 1;
                                    } while (filas_2 <= 0 && intentos_Igualdad3 < 3);

                                    if (filas_2 > 0 && intentos_Igualdad3 <= 3) {

                                        do {
                                            System.out.println("Matriz_2: Ingrese la cantidad de columnas:");
                                            columnas_2 = Integer.parseInt(System.console().readLine());
                                            intentos_Igualdad4 = intentos_Igualdad4 + 1;
                                        } while (columnas_2 <= 0 && intentos_Igualdad4 < 3);
                                        System.out.print("\033[H\033[2J");
                                        System.out.flush();

                                        if (columnas_2 > 0 && intentos_Igualdad4 <= 3) {

                                            // Declarar dimensiones de la matriz 2 de igualdad
                                            matriz_E = new int[filas_2][columnas_2];

                                            // Condicional if para verificar si ambas matrices tienen las mismas dimensiones
                                            if (filas_1 == filas_2 && columnas_1 == columnas_2) {
                                                // Variables para mostrar la coordenada actual que recorre la matriz
                                                int indice_D = 1;
                                                int indice_E = 1;

                                                // Ciclo for para ingresar los valores de las matrices de igualdad
                                                for (int i = 0; i < filas_1; i++) 
                                                {
                                                    for (int j = 0; j < columnas_1; j++) 
                                                    {
                                                        System.out.println("Matriz_1: Digite el valor_" + indice_D + ": ");
                                                        matriz_D[i][j] = Integer.parseInt(System.console().readLine());
                                                        indice_D++;
                                                    }
                                                }
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();
                                        
                                                for (int i = 0; i < filas_2; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_2; j++) 
                                                    { 
                                                        System.out.println("Matriz_2: Digite el valor_" + indice_E + ": "); 
                                                        matriz_E[i][j] = Integer.parseInt(System.console().readLine()); 
                                                        indice_E++; 
                                                    } 
                                                } 
                                                System.out.print("\033[H\033[2J"); 
                                                System.out.flush();

                                                // Variable para saber si la igualdad se cumple en cada (i,j) 
                                                int falso = 0;

                                                // Ciclo para recorrer las matrices y comprobar si son iguales 
                                                for (int i = 0; i < filas_1; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_1; j++) 
                                                    { 
                                                        if (matriz_D[i][j] == matriz_E[i][j]) 
                                                        { 
                                                            igualdad = true; 
                                                        } 
                                                        else 
                                                        { 
                                                            falso = falso + 1; 
                                                            igualdad = false; 
                                                        } 
                                                    } 
                                                }

                                                // Ciclo for para mostrar todas las matrices 
                                                System.out.println("Matriz_1"); 
                                                for (int i = 0; i < filas_1; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_1; j++) 
                                                    { 
                                                        System.out.print(matriz_D[i][j] + " "); 
                                                    } 
                                                    System.out.println(); 
                                                }

                                                System.out.println("Matriz_2"); 
                                                for (int i = 0; i < filas_2; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_2; j++) 
                                                    { 
                                                        System.out.print(matriz_E[i][j] + " "); 
                                                    } 
                                                    System.out.println(); 
                                                }

                                                System.out.println();

                                                // Condición if-else para mostrar si las matrices son iguales o no 
                                                if (igualdad == true && falso == 0) 
                                                { 
                                                    System.out.println("Ambas matrices son iguales"); 
                                                } 
                                                else 
                                                { 
                                                    System.out.println("Las dos matrices no son iguales entre sí"); 
                                                }

                                            } 
                                            else 
                                            { 
                                                System.out.println("Las matrices no tienen las mismas dimensiones, por lo cual no pueden ser iguales."); 
                                            } 
                                        } 
                                        else 
                                        { 
                                            System.out.println("Intentos agotados"); 
                                        }
                                    } 
                                    else 
                                    { 
                                        System.out.println("Intentos agotados"); 
                                    }
                                }
                                else 
                                { 
                                    System.out.println("Intentos agotados"); 
                                }
                            }
                            else 
                            { 
                                System.out.println("Intentos agotados"); 
                            }

                            break; 
                        } 
                    case 3: 
                        { 
                            System.out.println("3. Generar una matriz 0 de n x m."); 
                            System.out.println();
                                        
                            // Declaración de variables para los intentos
                            int intentos_MatrizNula1 = 0;
                            int intentos_MatrizNula2 = 0;

                            // Pido las dimensiones de la matriz
                            do {
                                System.out.println("Matriz: Ingrese la cantidad de filas:");
                                filas_1 = Integer.parseInt(System.console().readLine());
                                intentos_MatrizNula1 = intentos_MatrizNula1 + 1;
                            } while (filas_1 <= 0 && intentos_MatrizNula1 < 3);

                            if (filas_1 > 0 && intentos_MatrizNula1 <= 3) {

                                do {
                                    System.out.println("Matriz: Ingrese la cantidad de columnas:");
                                    columnas_1 = Integer.parseInt(System.console().readLine());
                                    intentos_MatrizNula2 = intentos_MatrizNula2 + 1;
                                } while (columnas_1 <= 0 && intentos_MatrizNula2 < 3);

                                if (columnas_1 > 0 && intentos_MatrizNula2 <= 3) {

                                    matriz_Cero = new int[filas_1][columnas_1];

                                    // Igualo cada valor de la matriz con un 0
                                    for (int i = 0; i < filas_1; i++) {

                                        for (int j = 0; j < columnas_1; j++) 
                                        {
                                            matriz_Cero[i][j] = 0;
                                        }
                                    }

                                    System.out.println("Matriz_Nula");
                                    for (int i = 0; i < filas_1; i++) {

                                        for (int j = 0; j < columnas_1; j++) 
                                        {
                                            System.out.print(matriz_Cero[i][j] + "  ");
                                        }
                                        System.out.println();
                                    }
                                } 
                                else 
                                {
                                    System.out.println("Intentos agotados");
                                }
                            } 
                            else 
                            { 
                                System.out.println("Intentos agotados"); 
                            }

                            break; 
                        } 
                    case 4: 
                        { 
                            System.out.println("4. Restar dos matrices."); 
                            System.out.println();

                            // Declaración de variables para los intentos
                            int intentos_Resta1 = 0;
                            int intentos_Resta2 = 0;

                            int intentos_Resta3 = 0;
                            int intentos_Resta4 = 0;

                            // Validación de filas y columnas para evitar datos incorrectos
                            do {
                                System.out.println("Matriz_1: Ingrese la cantidad de filas:");
                                filas_1 = Integer.parseInt(System.console().readLine());
                                intentos_Resta1 = intentos_Resta1 + 1;
                            } while (filas_1 <= 0 && intentos_Resta1 < 3);

                            if (filas_1 > 0 && intentos_Resta1 <= 3) {

                                do {
                                    System.out.println("Matriz_1: Ingrese la cantidad de columnas:");
                                    columnas_1 = Integer.parseInt(System.console().readLine());
                                    intentos_Resta2 = intentos_Resta2 + 1;
                                } while (columnas_1 <= 0 && intentos_Resta2 < 3);

                                if (columnas_1 > 0 && intentos_Resta2 <= 3) {
                                    
                                    // Modifico las dimensiones de la matriz
                                    matriz_F = new int[filas_1][columnas_1];

                                    System.out.println();

                                    // Mismo proceso para la matriz_2
                                    do {
                                        System.out.println("Matriz_2: Ingrese la cantidad de filas:");
                                        filas_2 = Integer.parseInt(System.console().readLine());
                                        intentos_Resta3 = intentos_Resta3 + 1;
                                    } while (filas_2 <= 0 && intentos_Resta3 < 3);

                                    if (filas_2 > 0 && intentos_Resta3 <= 3) { 

                                        do { 
                                            System.out.println("Matriz_2: Ingrese la cantidad de columnas:"); 
                                            columnas_2 = Integer.parseInt(System.console().readLine()); 
                                            intentos_Resta4 = intentos_Resta4 + 1; 
                                        } while (columnas_2 <= 0 && intentos_Resta4 < 3);
                                    
                                        if (columnas_2 > 0 && intentos_Resta4 <= 3) {

                                            matriz_G = new int[filas_2][columnas_2];
                                            System.out.print("\033[H\033[2J");
                                            System.out.flush();

                                            if (filas_1 == filas_2 && columnas_1 == columnas_2) {

                                                // Declarar variable índice para mostrar al usuario la ubicación exacta
                                                int indice_F = 1;

                                                // Ciclo for para recorrer toda la matriz
                                                for (int i = 0; i < filas_1; i++) 
                                                {
                                                    for (int j = 0; j < columnas_1; j++) 
                                                    {
                                                        System.out.println("Matriz_1: Digite el valor_" + indice_F + ": ");
                                                        matriz_F[i][j] = Integer.parseInt(System.console().readLine());
                                                        indice_F++;
                                                    }
                                                }
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();

                                                int indice_G = 1;
                                                for (int i = 0; i < filas_2; i++) {
                                                        for (int j = 0; j < columnas_2; j++) {
                                                            System.out.println("Matriz_2: Digite el valor_" + indice_G + ": ");
                                                            matriz_G[i][j] = Integer.parseInt(System.console().readLine());
                                                            indice_G++;
                                                        }
                                                }
                                                System.out.print("\033[H\033[2J");
                                                System.out.flush();

                                                // La matriz resta se encargará de guardar los valores
                                                matriz_Resta = new int[filas_1][columnas_1];

                                                // Ciclo for para restar cada valor correspondiente
                                                for (int i = 0; i < filas_1; i++) 
                                                {
                                                    for (int j = 0; j < columnas_1; j++) 
                                                    {
                                                        matriz_Resta[i][j] = matriz_F[i][j] - matriz_G[i][j];
                                                    }
                                                }
                                        
                                                // Ciclo for para mostrar todas las matrices 
                                                System.out.println("Matriz_A"); 
                                                for (int i = 0; i < filas_1; i++) 
                                                { 
                                                    for (int j = 0; j < columnas_1; j++) { 
                                                        System.out.print(matriz_F[i][j] + " "); 
                                                    } System.out.println(); 
                                                }

                                                System.out.println("Matriz_B"); 
                                                for (int i = 0; i < filas_2; i++) { 
                                                    for (int j = 0; j < columnas_2; j++) { 
                                                        System.out.print(matriz_G[i][j] + " "); 
                                                    } System.out.println(); 
                                                }

                                                System.out.println("Matriz_Resta (A-B)"); 
                                                for (int i = 0; i < filas_1; i++) { 
                                                    for (int j = 0; j < columnas_1; j++) { 
                                                        System.out.print(matriz_Resta[i][j] + " "); 
                                                    } System.out.println(); 
                                                }
                                            } 
                                            else 
                                            { 
                                                System.out.println("Las dimensiones de ambas matrices no coinciden entre sí."); 
                                            } 
                                        } 
                                        else 
                                        { 
                                            System.out.println("Intentos agotados"); 
                                        } 
                                    } 
                                    else
                                    { 
                                        System.out.println("Intentos agotados"); 
                                    } 
                                } 
                                else 
                                { 
                                    System.out.println("Intentos agotados"); 
                                } 
                            } 
                            else 
                            { 
                                System.out.println("Intentos agotados"); 
                            }

                            break; 
                        } 
                    case 5: 
                        { 
                            System.out.println("5. Multiplicar un escalar por una matriz de n x m."); 
                            System.out.println();

                            // Declaración de variables para los intentos
                            int intentos_Escalar1 = 0;
                            int intentos_Escalar2 = 0;

                            // Pido las dimensiones de la matriz_1
                            do {
                                System.out.println("Matriz: Ingrese la cantidad de filas:");
                                filas_1 = Integer.parseInt(System.console().readLine());
                                intentos_Escalar1 = intentos_Escalar1 + 1;
                            } while (filas_1 <= 0 && intentos_Escalar1 < 3);

                            if (filas_1 > 0 && intentos_Escalar1 <= 3) { 

                                do { 
                                    System.out.println("Matriz: Ingrese la cantidad de columnas:"); 
                                    columnas_1 = Integer.parseInt(System.console().readLine()); 
                                    intentos_Escalar2 = intentos_Escalar2 + 1; 
                                } while (columnas_1 <= 0 && intentos_Escalar2 < 3); 
                                System.out.print("\033[H\033[2J"); 
                                System.out.flush();
                                
                                if (columnas_1 > 0 && intentos_Escalar2 <= 3) {

                                matriz_C = new int[filas_1][columnas_1];
                                matriz_Escalar = new int[filas_1][columnas_1];

                                int indice_C = 1;
                                // Ciclo for para recorrer toda la matriz
                                for (int i = 0; i < filas_1; i++) 
                                {
                                    for (int j = 0; j < columnas_1; j++) 
                                    {
                                        System.out.println("Matriz: Digite el valor_" + indice_C + ": ");
                                        matriz_C[i][j] = Integer.parseInt(System.console().readLine());
                                        indice_C++;
                                    }
                                }
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                // Declarar la variable del escalar
                                int escalar;
                                System.out.println("Ingresa el valor del escalar:");
                                escalar = Integer.parseInt(System.console().readLine()); // Asignar el valor del escalar

                                // Recorro la matriz y la multiplico por el valor del escalar
                                for (int i = 0; i < filas_1; i++) {
                                    for (int j = 0; j < columnas_1; j++) 
                                    {
                                        matriz_Escalar[i][j] = escalar * matriz_C[i][j];
                                    }
                                }

                                // Muestro ambas matrices
                                System.out.println("Matriz_original");
                                for (int i = 0; i < filas_1; i++) {
                                    for (int j = 0; j < columnas_1; j++) {
                                        System.out.print("(" + escalar + ")" + matriz_C[i][j] + "  ");
                                    }
                                    System.out.println();
                                }

                                System.out.println("Matriz_Escalar");
                                for (int i = 0; i < filas_1; i++) {
                                    for (int j = 0; j < columnas_1; j++) {
                                        System.out.print(matriz_Escalar[i][j] + "  ");
                                    }
                                    System.out.println();
                                }
                            } 
                            else 
                            {
                                System.out.println("Intentos agotados");
                            }
                        } 
                        else 
                        { 
                            System.out.println("Intentos agotados"); 
                        }

                        break; 
                    } 
                case 6: 
                    { 
                        System.out.println("6. Obtener una matriz identidad de tamaño n."); 
                        System.out.println();
                                        
                        // Declaración de variables para los intentos
                        int intentos_Identidad1 = 0;
                        int intentos_Identidad2 = 0;

                        // Pido las dimensiones de la matriz
                        do {
                            System.out.println("Matriz: Ingrese la cantidad de filas:");
                            filas_1 = Integer.parseInt(System.console().readLine());
                            intentos_Identidad1 = intentos_Identidad1 + 1;
                        } while (filas_1 <= 0 && intentos_Identidad1 < 3);

                        if(filas_1 > 0 && intentos_Identidad1 <= 3)
                        {
                            do
                            {
                                System.out.println("Matriz: Ingrese la cantidad de columnas:");
                                columnas_1 = Integer.parseInt(System.console().readLine());
                                intentos_Identidad2 = intentos_Identidad2 + 1;
                            }while(columnas_1 <= 0 && intentos_Identidad2 < 3);

                            if (columnas_1 > 0 && intentos_Identidad2 <= 3) 
                            { 
                                matriz_Identidad = new int[filas_1][columnas_1];

                                if (filas_1 == columnas_1) {
                                    // Igualo cada valor de la matriz con un 0
                                    for (int i = 0; i < filas_1; i++) 
                                    {
                                        for (int j = 0; j < columnas_1; j++) 
                                        {
                                            if (i == j) 
                                            {
                                                matriz_Identidad[i][j] = 1;
                                            } else 
                                            {
                                                matriz_Identidad[i][j] = 0;
                                            }
                                        }
                                    }

                                    System.out.println("Matriz_Identidad");
                                    for (int i = 0; i < filas_1; i++) {
                                        for (int j = 0; j < columnas_1; j++) {
                                            System.out.print(matriz_Identidad[i][j] + "  ");
                                        }
                                        System.out.println();
                                    }
                                } 
                            else 
                            {
                                System.out.println("No existe una matriz identidad para una matriz que no es cuadrada");
                            }
                        } 
                        else 
                        { 
                            System.out.println("Intentos agotados"); 
                        } 
                    } 
                    else 
                    {
                        System.out.println("Intentos agotados"); 
                    } 

                    break; 
                } 
        }       
    } 
    System.out.println();

    // Declaración de variables para la pregunta de iniciar y con contador de intentos 
    int opcion_pregunta = 0; 
    int intentos_pregunta = 0;

    do { 
        System.out.println("Desea volver a iniciar el programa? OJO:Digita un 0-1!! (si = 0 / no = 1)"); 
        opcion_pregunta = Integer.parseInt(System.console().readLine()); 
        // Asignación de la variable pregunta 
        intentos_pregunta = intentos_pregunta + 1; 
    } while ((opcion_pregunta != 0 && opcion_pregunta != 1) && intentos_pregunta < 3); 
    System.out.println();

    // Condicional if-else para verificar la respuesta y tomar acción 
    if (intentos_pregunta >= 3) { 
        System.out.println("Lo siento, el máximo son tres intentos"); 
        repetir = 1; 
    } else if (opcion_pregunta == 0) { 
        repetir = 0; 
    } 
    else 
    { 
        repetir = 1; 
    }

    System.out.print("\033[H\033[2J"); 
    System.out.flush();

    } while (repetir == 0);

    // Si se sale del bucle es que finalizó el programa y solo espera que teclee para cerrar 
    System.out.print("Se cerró el programa, pulse una tecla para salir");

    }
}
