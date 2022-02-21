package com.javaprogram;

import java.util.TreeMap;
import java.util.TreeSet;

public class Tugas1 {

	public static void main(String[] args) {
	
		// TreeMap
		TreeMap<Integer, String> barang = new TreeMap<>();
		barang.put(1, "Pulpen");
		barang.put(3, "Buku");
		barang.put(2, "Penggaris");
		barang.put(5, "Spidol");
		barang.put(4, "Penghapus");
		for (Integer key : barang.keySet()) {
			System.out.println("Kode Barang " + key + " adalah " + barang.get(key));
		}

		// TreeSet
		System.out.println("=========================");
		TreeSet<String> barang1 = new TreeSet<>();
		barang1.add("Tas");
		barang1.add("Baju Sekolah");
		barang1.add("Celana Sekolah");
		barang1.add("Topi");
		barang1.add("Dasi");

		for (String outfit : barang1) {
			System.out.println(outfit);
		}
	}

}
