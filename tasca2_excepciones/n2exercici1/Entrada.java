package tasca2_excepciones.n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
        private static final Scanner entrada = new Scanner(System.in);

        public static byte leerByte(String mensaje) {
                System.out.println(mensaje);

                byte numero = 0;
                boolean comprobar = false;

                while (!comprobar) {
                        try {
                                numero = entrada.nextByte();
                                comprobar = true;
                        } catch (InputMismatchException e) {
                                System.err.println("Por favor introduce un byte válido.");
                                entrada.nextLine();
                        }
                }

                return numero;
        }

        public static int leerInt(String mensaje) {
                System.out.println(mensaje);

                int numero = 0;
                boolean comprobar = false;

                while (!comprobar) {
                        try {
                                numero = entrada.nextInt();
                                comprobar = true;
                        } catch (InputMismatchException e) {
                                System.err.println("Por favor introduce un integer válido.");
                                entrada.nextLine();
                        }

                }

                return numero;
        }

        public static float leerFloat(String mensaje) {
                System.out.println(mensaje);

                float numeroDecimal = 0.0F;
                boolean comprobar = false;

                while (!comprobar) {
                        try {
                                numeroDecimal = entrada.nextFloat();
                                comprobar = true;
                        } catch (InputMismatchException e) {
                                System.err.println("Por favor introduce un float válido.");
                                entrada.nextLine();
                        }
                }
                return numeroDecimal;
        }

        public static double leerDouble(String mensaje) {
                System.out.println(mensaje);

                double numeroDecimal = 0.0D;
                boolean comprobar = false;

                while (!comprobar) {
                        try {
                                numeroDecimal = entrada.nextDouble();
                                comprobar = true;
                        } catch (InputMismatchException e) {
                                System.err.println("Por favor introduce un double válido.");
                                entrada.nextLine();
                        }
                }

                return numeroDecimal;
        }

        public static char leerChar(String mensaje) {
                System.out.println(mensaje);

                char caracter = ' ';
                boolean comprobar = false;

                while (!comprobar) {
                        try {
                                caracter = entrada.next().charAt(0);
                                comprobar = true;
                        } catch (Exception e) {
                                System.err.println("Por favor introduce un char válido.");
                                entrada.nextLine();
                        }
                }
                return caracter;
        }

        public static String leerString(String mensaje) {
                System.out.println(mensaje);

                String valorString = "";
                boolean comprobar = false;

                while (!comprobar) {
                        try {
                                valorString = entrada.next();
                                if (valorString.isEmpty()) {
                                        throw new Exception();
                                } else {
                                        entrada.nextLine();
                                        comprobar = true;
                                }
                        } catch (Exception e) {
                                System.err.println("Por favor introduce un String válido.");
                                entrada.nextLine();

                        }
                }
                return valorString;
        }

        public static boolean leerSiNo(String mensaje) {
                System.out.println(mensaje);
                boolean valorBoolean = false; // Asignar un valor inicial a la variable
                boolean comprobar = false;

                while (!comprobar) {
                        try {
                                valorBoolean = entrada.nextBoolean();
                                comprobar = true;
                        } catch (Exception e) {
                                String input = entrada.next();
                                if (input.equalsIgnoreCase("s")) {
                                        valorBoolean = true;
                                        comprobar = true;
                                } else if (input.equalsIgnoreCase("n")) {
                                    comprobar = true;
                                } else {
                                        System.err.println("Por favor introduce un booleano válido.");
                                }
                        }
                }
                return valorBoolean;
        }

}