package com.javaprogram;

import java.util.Scanner;

public class Tugas2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// variabel
		Scanner input = new Scanner(System.in);
		int angka1, angka2, pilihan;

		// menu
		System.out.println("Kalkulator");
		System.out.println("1. Pertambahan ");
		System.out.println("2. Pengurangan ");
		System.out.println("3. Perkalian ");
		System.out.println("4. Pembagian ");
		System.out.print("Masukan pilihan :");
		pilihan = input.nextInt();

		// pilihan
		switch (pilihan) {
			case 1: {
				System.out.print("Angka Pertama : ");
				angka1 = input.nextInt();
				System.out.print("Angka Kedua : ");
				angka2 = input.nextInt();
				Penjumlahan tambah = new Penjumlahan();
				System.out.println("Hasil : " + tambah.penjumlahan(angka1, angka2));
				break;
			}

			case 2: {
				System.out.print("Angka Pertama : ");
				angka1 = input.nextInt();
				System.out.print("Angka Kedua : ");
				angka2 = input.nextInt();
				Pengurangan kurang = new Pengurangan();
				try {
					if (kurang.pengurangan(angka1, angka2) < 0) {
						throw new Exception("Error, Hasil tidak boleh di bawah 0");
					} else {
						System.out.println("Hasil : " + kurang.pengurangan(angka1, angka2));
					}
				} catch (Exception e) {
					throw new Exception(e);
				}
				break;
			}

			case 3: {
				System.out.print("Angka Pertama : ");
				angka1 = input.nextInt();
				System.out.print("Angka Kedua : ");
				angka2 = input.nextInt();
				Perkalian kali = new Perkalian();
				System.out.println("Hasil : " + kali.perkalian(angka1, angka2));
				break;
			}

			case 4: {
				System.out.print("Angka Pertama : ");
				angka1 = input.nextInt();
				System.out.print("Angka Kedua : ");
				angka2 = input.nextInt();
				Pembagian bagi = new Pembagian();
				System.out.println("Hasil : " + bagi.pembagian(angka1, angka2));
				break;
			}

			default: {
				System.out.println("Pilihannya Salah/Tidak Ada");
			}

		}

	}

}
