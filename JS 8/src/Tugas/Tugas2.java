package Tugas;

/*
* Created_By_21343019_Arafil Azmi
*/

import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {

        int number[] = new int[11];
        int jumlah,max;

            for(int i = 1 ; i < number.length ; i++)
            {
             number[i] = Integer.valueOf(JOptionPane.showInputDialog("Silahkan Masukan Angka Ke " +i+ " : "));
            }

        jumlah = 10;
        max = number[0];

        for(int i = 0; i <= jumlah ; i++)
        {
            if(number[i] > max)
            {
                max = number[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Angka Terbesar Yang Anda Inputkan : " + max);
    }
}
