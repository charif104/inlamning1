package com.company;
import java.util.Scanner;
public class Calculate{
        private double vek[] = new double[2];


        public Calculate() {

        }
        /**
         *
         * @param v
         * set method för att setta tal i variable vek
         */
        public void setVek(double [] v) {
            this.vek= v;
        }

        /**
         * method för att returer vek;
         * @return
         */
        public double [] getVek()  {
            return vek;
        }
        /**
         * method för spara indata eller dem två tal som användare har valt
         */
        public void inMata() {
            Scanner scan = new Scanner(System.in) ;
            for (int i=0; i<vek.length ; i++) {
                System.out.print("Ange tal:  ");

                while (!scan.hasNextInt())
                {
                    scan.next();
                    System.out.print("Please enter an integer: ");
                }

                vek[i] = scan.nextInt(); //
            }
        }

        /**
         * Method som har en switch case för att att låter användare välja ett aktivitet
         */
        public void valja() {
            Scanner scan = new Scanner(System.in) ;
            int val = 0;
            while (val !=5) {      //8-  while loop så länge inte valde 5
                System.out.println("Vad vill du göra ? \n1:Addera  \n2:Subtrahera"+ "\n3: Multiplicera  \n4: Dividera  \n5:Avsluta"); //5
                System.out.print("Ange ditt val: ");                                                                        //6

                try {
                    val=Integer.parseInt(scan.nextLine());

                    switch(val) {         //10- switch val
                        // 11- en av dem casen kan vara körs , case mellan 1 till 4 så hoppar programmet till method inMata()
                        case 1:
                            System.out.println("Du valde addera");
                            inMata();
                            addera(vek);
                            break;

                        case 2:
                            System.out.println("Du valde subtrahera");
                            inMata();
                            subtrahera(vek);
                            break;

                        case 3:
                            System.out.println("Du valde multiplicera");
                            inMata();
                            multi(vek);

                            break;

                        case 4:
                            System.out.println("Du valde dividera");
                            inMata();
                            dividera(vek);
                            break;

                        case 5:
                            System.out.println("Avslutat");
                            break;

                        default:
                            System.out.println("Välja mellan 1 to 5 !!");
                            break;
                    }
                }
                catch(NumberFormatException e){

                }
            }
        }


        /*
         * add method
         */
        public void addera(double [] v) {
            double sum = 0 ;
            for(int i=0; i < v.length; i++) {

                //sum = sum + con.getVek([i]);
                sum =sum +  v[i];
            }
            System.out.print("Summan av både nummer är "+ sum);
            System.out.println();
        }

        /*
         * sub method
         */
        public void subtrahera(double []v) {
            double sub = 0 ;

            for(int i=v.length-1; i>=0; i--) {
                sub = v[i] -sub ;
            }
            System.out.print("Subtraherne av både nummer är "+ sub);
            System.out.println();
        }

        /*
         * multiplicering method
         */
        public void multi(double []v) {
            double mult = 1 ;
            for(int i=0; i < v.length; i++) {
                mult = mult*v[i];
            }
            System.out.print("Multiplication av både nummer är "+ mult);
            System.out.println();

        }
        /*
         * dividering method
         */
        public void dividera(double []v) {
            double div ;
            if(v[0]==0) {
                System.out.println("Det går inte att dividera 0");
            }else {
                div= (v[0]/v[1]);
                System.out.println("Dividering av både nummer är :" +div);

            }

        }
    }



