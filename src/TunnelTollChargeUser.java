import java.util.Scanner;

public class TunnelTollChargeUser {
    static Car[] c = new Car[6];
    static int num_Wheel = -1;
    static double lenGth = -1.0;
    static int Axles = -1;
    static double weiGht = -1.0;

    public static void main(String[] args) {
        String[] classType = new String[]{"Motorbike", "Car", "Car with trailer", "Van", "Small lorry/Bus", "Large lorry"};
        double[] price = new double[]{2.00, 3.20, 3.80, 4.40, 8.00, 12.00};
        for (int i = 0; i < 6; i++) {
            c[i] = new Car(classType[i], i + 1, price[i], false);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of wheels (an integer greater than 0):");
        num_Wheel = sc.nextInt();
        if (num_Wheel < 2) {
            System.out.println("invaild input");
            return;
        } else if (num_Wheel < 4) {
            System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
            String next = sc.next();
            if (next.equals("true")) {
            } else if (next.equals("false")) {
                c[0].setWeekend(true);
            } else {
                System.out.println("invaild input");
                return;
            }
            checkVar();
            if (c[0].isWeekend())
                System.out.println("weekend");
            else
                System.out.println("weekday");
            System.out.println(c[0].toString());
            return;
        } else if (num_Wheel == 4) {
            System.out.println("Input the length of the vehicle in feet (a double greater than 0.0):");
            lenGth = sc.nextDouble();
            if (lenGth < 0) {
                System.out.println("invaild input");
                return;
            } else if (lenGth <= 15) {
                System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                String next = sc.next();
                if (next.equals("true")) {
                } else if (next.equals("false")) {
                    c[1].setWeekend(true);
                } else {
                    System.out.println("invaild input");
                    return;
                }
                checkVar();
                if (c[1].isWeekend())
                    System.out.println("weekend");
                else
                    System.out.println("weekday");
                System.out.println(c[1].toString());
                return;
            } else {
                System.out.println("Input the number of axles (an integer greater than 2):");
                Axles = sc.nextInt();
                if (Axles < 2) {
                    System.out.println("invaild input");
                    return;
                } else if (Axles == 2) {
                    System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                    String next = sc.next();
                    if (next.equals("true")) {
                    } else if (next.equals("false")) {
                        c[3].setWeekend(true);
                    } else {
                        System.out.println("invaild input");
                        return;
                    }
                    checkVar();
                    if (c[3].isWeekend())
                        System.out.println("weekend");
                    else
                        System.out.println("weekday");
                    System.out.println(c[3].toString());
                    return;
                } else if (Axles >= 3 && Axles <= 6) {  // 2,4
                    System.out.println("Input the weight of the vehicle in metric tons:");
                    weiGht = sc.nextDouble();
                    if (weiGht <= 2) {
                        System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                        String next = sc.next();
                        if (next.equals("true")) {
                        } else if (next.equals("false")) {
                            c[2].setWeekend(true);
                        } else {
                            System.out.println("invaild input");
                            return;
                        }
                        checkVar();
                        if (c[2].isWeekend())
                            System.out.println("weekend");
                        else
                            System.out.println("weekday");
                        System.out.println(c[2].toString());
                    } else {
                        System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                        String next = sc.next();
                        if (next.equals("true")) {
                        } else if (next.equals("false")) {
                            c[4].setWeekend(true);
                        } else {
                            System.out.println("invaild");
                            System.out.println(" input");
                            return;
                        }
                        checkVar();
                        if (c[4].isWeekend())
                            System.out.println("weekend");
                        else
                            System.out.println("weekday");
                        System.out.println(c[4].toString());
                    }
                } else {               //4,5
                    System.out.println("Input the weight of the vehicle in metric tons:");
                    weiGht = sc.nextDouble();
                    if (weiGht <= 3.5) {
                        System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                        String next = sc.next();
                        if (next.equals("true")) {
                        } else if (next.equals("false")) {
                            c[4].setWeekend(true);
                        } else {
                            System.out.println("invaild input");
                            return;
                        }
                        checkVar();
                        if (c[4].isWeekend())
                            System.out.println("weekend");
                        else
                            System.out.println("weekday");
                        System.out.println(c[4].toString());
                    } else {
                        System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                        String next = sc.next();
                        if (next.equals("true")) {
                        } else if (next.equals("false")) {
                            c[5].setWeekend(true);
                        } else {
                            System.out.println("invaild input");
                            return;
                        }
                        checkVar();
                        if (c[5].isWeekend())
                            System.out.println("weekend");
                        else
                            System.out.println("weekday");
                        System.out.println(c[5].toString());
                    }
                }
            }
        } else {         //2 , 4 , 5
            System.out.println("Input the length of the vehicle in feet (a double greater than 0.0):");
            lenGth = sc.nextDouble();
            System.out.println("Input the number of axles (an integer greater than 2):");
            Axles = sc.nextInt();
            if (Axles < 2) {
                System.out.println("invaild input");
                return;
            }
            System.out.println("Input the weight of the vehicle in metric tons:");
            if (Axles >= 3 && Axles <= 6) {  // 2,4
                weiGht = sc.nextDouble();
                if (weiGht <= 2) {
                    System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                    String next = sc.next();
                    if (next.equals("false")) {
                        c[4].setWeekend(true);
                    } else if (next.equals("true")) {
                        c[4].setWeekend(false);
                    } else {
                        System.out.println("invaild input");
                        return;
                    }
                    checkVar();
                    if (c[2].isWeekend())
                        System.out.println("weekend");
                    else
                        System.out.println("weekday");
                    System.out.println(c[2].toString());
                } else {
                    System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                    String next = sc.next();
                    if (next.equals("true")) {
                    } else if (next.equals("false")) {
                        c[4].setWeekend(true);
                    } else {
                        System.out.print("invaild input");
                        System.out.println();
                        return;
                    }
                    checkVar();
                    if (c[4].isWeekend())
                        System.out.println("weekend");
                    else
                        System.out.println("weekday");
                    System.out.println(c[4].toString());
                }
            } else {               //4,5
                weiGht = sc.nextDouble();
                if (weiGht <= 3.5) {
                    System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                    String next = sc.next();
                    if (next.equals("true")) {

                    } else if (next.equals("false")) {
                        c[4].setWeekend(true);
                    } else {
                        System.out.print("invaild");
                        System.out.println(" input");
                        return;
                    }
                    checkVar();
                    if (c[4].isWeekend())
                        System.out.println("weekend");
                    else
                        System.out.println("weekday");
                    System.out.println(c[4].toString());
                } else {
                    System.out.println("Input true if travelling on a weekday (Mon-Fri) and false otherwise:");
                    String next = sc.next();
                    if (next.equals("true")) {

                    } else if (next.equals("false")) {
                        c[5].setWeekend(true);
                    } else {
                        System.out.print("invaild");
                        System.out.println(" input");
                        return;
                    }
                    checkVar();
                    if (c[5].isWeekend())
                        System.out.println("weekend");
                    else
                        System.out.println("weekday");
                    System.out.println(c[5].toString());
                }
            }
        }
    }

    public static void checkVar() {
        if (num_Wheel > 0)
            System.out.print("Wheels: " + num_Wheel + ", ");
        if (lenGth > 0)
            System.out.print("length: " + lenGth + ", ");
        if (Axles > 0)
            System.out.print("axles: " + Axles + ", ");
        if (weiGht > 0)
            System.out.print("weight: " + weiGht + ", ");
    }

    static class Car {
        private String type;
        private int classLevel;
        private double cost;
        private boolean isWeekend;

        public Car(String type, int classLevel, double cost, boolean isWeekend) {
            this.type = type;
            this.classLevel = classLevel;
            this.cost = cost;
            this.isWeekend = isWeekend;
        }

        public void setWeekend(boolean weekend) {
            isWeekend = weekend;
        }

        public boolean isWeekend() {
            return isWeekend;
        }

        @Override
        public String toString() {
            if (isWeekend)
                return "Vehicle class:" + classLevel + "\nVehicle type:" + type + "\nVehicle charge:" + cost * 0.75;
            else
                return "Vehicle class:" + classLevel + "\nVehicle type:" + type + "\nVehicle charge:" + cost;
        }
    }
}