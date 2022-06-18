package Univ;

import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) {
            Manusia mns1 = new Manusia("DICKY", "215150600111031", false, true);
            Manusia mns2 = new Manusia("ANDI", "185150601111018", true, true);
            Manusia mns3 = new Manusia("FIRMAN", "205150200111034", true, false);
            ArrayList<Manusia> output = new ArrayList<Manusia>();
            output.add(mns1);
            output.add(mns2);
            output.add(mns3);

            System.out.println("===== CLASS MANUSIA =====");
            for(int i=0;i<output.size();i++){
                System.out.println(output.get(i).toString());
            }
            System.out.println("==========================");

            Mahasiswa mhs1 = new Mahasiswa("AHMAD", "331628954662419", false, false, "215150601111004", 3.5);
            Mahasiswa mhs2 = new Mahasiswa("MAULANA", "3315479123424578", false, true, "215150601111010", 4.0);
            Mahasiswa mhs3 = new Mahasiswa("KINDI", "331616785217464", false, false, "215150600111016", 3.2);
            ArrayList<Mahasiswa> output1 = new ArrayList<Mahasiswa>();
            output1.add(mhs1);
            output1.add(mhs2);
            output1.add(mhs3);

            System.out.println();
            System.out.println("====== DAFTAR MAHASISWA ======");
            for(int i=0;i<output1.size();i++){
                System.out.println(output1.get(i).toString());
            }
            System.out.println("=====================================");

            Pekerja pkj1 = new Pekerja("GINTA", "351167356892568", false, true, 10, 29, "13654331");
            Pekerja pkj2 = new Pekerja("HARIS", "351198743076268", true, false, 14, 23, "13654331");
            Pekerja pkj3 = new Pekerja("INDAH", "3511075378294610", false, true, 17, 19, "13654331");
            ArrayList<Pekerja> output2 = new ArrayList<Pekerja>();
            output2.add(pkj1);
            output2.add(pkj2);
            output2.add(pkj3);

            System.out.println();
            System.out.println("========== CLASS PEKERJA ==========");
            for(int i=0;i<output2.size();i++){
                System.out.println(output2.get(i).toString());
            }
            System.out.println("===================================");

            Manager mnj1 = new Manager("NINA", "3326789354678036", false, true,9, 25,"1654311", 3789);
            Manager mnj2 = new Manager("DONI", "3326634267893547", false, false,8, 28,"1654311", 3789);
            Manager mnj3 = new Manager("SYLE", "3326032674893640", true, true,6, 25,"1654311", 3432);
            ArrayList<Manager> output3 = new ArrayList<Manager>();
            output3.add(mnj1);
            output3.add(mnj2);
            output3.add(mnj3);

            System.out.println();
            System.out.println("=========== CLASS MANAGER ==========");
            for(int i=0;i<output3.size();i++){
                System.out.println(output3.get(i).toString());
            }
            System.out.println("=====================================");

        }
    }
