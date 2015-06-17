package ua.ziper;

import java.util.*;

import ua.ziper.repo.Test;


public final class Algo{

	// �������� �� ������ �����
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}

	// ������� ������
	public static int maxDivider(int a, int b) {
		if (b == 0) return a;
		return maxDivider(b, a % b);
	}

	// �������� �����
	public static int binFind(int key, int s[]) {
		int a = 0;
		int b = s.length - 1;
		while (a <= b) {
			int mid = a + (b - a) / 2;
			if      (key < s[mid]) b = mid - 1;
			else if (key < s[mid]) a = mid + 1;
			else return mid;
		}
		return -1;
	}

	// ����� � ����������� �������
	public static int[] feedbackArray(int[] s) {
		int n = s.length;
		for (int i = 0; i < n / 2; i++) {
			int temp = s[i];
			s[i] = s[n - 1 - i];
			s[n - i - 1] = temp;
		}
		return s;
	}
	
	// ��� Գ������
	public static int fibonachi(int a){
		if(a==0) return 0;
		if(a==1) return 1;
		return(fibonachi(a-1)+fibonachi(a-2));
	}
	
	/*
	 *  SORT   
	 */
	
	// �������� �� ������������� ������
	public static boolean isSort(Comparable s[]){
		for (int i = 0; i < s.length-1; i++) {
			if(s[i].compareTo(s[i+1])==1)
				return false;
		}
		return true;
	}
	
	 
	/*
	 * ���������� ������� 
	 * �������� ������ ��������� ������� � ������� ���� � ������� ������
	 * ���� ����� ������ ��������� ������� �� ���������� ������ ��������� � ����������� ���������. 
	 */
	public static void sortSelection(Comparable[] s){
	  	if(isSort(s)) return;
	  	
	  	for (int i = 0; i < s.length; i++) {
	  		int index = i;
			for (int j = i+1; j < s.length; j++) {
				if(s[index].compareTo(s[j])==1)
					index = j;
			}
			
			Comparable smallerValue = s[index];
			s[index]=s[i];
			s[i]= smallerValue;
		}
	}
	
	/*
	 * ���������� �������� 
	 * ����� ����������� ������� ������������ � ���������� ������ ����
	 * ���� ������ ������� ������ �� ������ ������.
	 */
	public static void sortInsert(Comparable[] a){
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j>0 && a[j-1].compareTo(a[j])==1; j--) {
			   Comparable temp = a[j];
			   a[j]=a[j-1];
			   a[j-1]=temp;
			}
		}
	}
	
	/*
	 * ���������� ������� ����� (�������� �� ��������� ���������)
	 */
	public static void sortShall(Comparable[] a){
		int N = a.length;
		int h = 1;
		while(h<N/3) h = 3*h+1; // ���������� ��������� ������
		while(h>=1){ // ��� ����� h = 1 �� �������� ���������� ���������.
			for (int i = h; i < N; i++) {
				for (int j = i; j >= h && a[j].compareTo(a[j-h])==1; j=j-h) {
					Comparable temp = a[j];
					a[j]=a[j-h];
					a[j-h]=temp;
				}
			}
			h=h/3; // �������� ���� � �������� �� ����� ���������� ���������
		}
	}
	
	public static void main(String[] args) {
		Integer t[] = {4,5,1,1,2,0,9,8,6,5,5,4,5,6,7,5,6,7,4,3,4,51,6,
				       2,0,1,2,5,7,3,4,0,0,7,6,5,4,7,8,9,2,1,4,
				       2,0,1,2,5,7,3,4,0,0,7,6,5,4,7,8,9,2,1,4,
				       2,0,1,2,5,7,3,4,0,0,7,6,5,4,7,8,9,2,1,4,
				       2,0,1,2,5,7,3,4,0,0,7,6,5,4,7,8,9,2,1,4,
				       2,0,1,2,5,7,3,4,0,0,7,6,5,4,7,8,9,2,1,4};
		sortShall(t);
		System.out.println(Arrays.toString(t));
	}
	
}

