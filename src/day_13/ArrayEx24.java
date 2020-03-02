/*
 * # 최대값 구하기[3단계]
 * 1. 가장 큰 값을 찾아 입력한다.
 * 2. 정답이면 해당 값을 0으로 변경한다.
 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
 * 예)
 * 11, 87, 42, 100, 24
 * 입력 : 100
 * 
 * 11, 87, 42, 0, 24
 * 입력 : 87
 * 
 * 11, 0, 42, 0, 24
 */
package day_13;

import java.util.Scanner;

public class ArrayEx24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {11, 87, 42, 100, 24};
		
		int check = 0;
		int count = 0;

		while(true)
		{
			int max = 0;
			
			for(int i=0;i<5;i++)
			{
				if(max<arr[i])
				{
					max = arr[i];;
					check = i;
				}
			}
			
			System.out.print("[");
			for(int i=0;i<5;i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.print("]");
			System.out.println();
			
			System.out.println("최댓값을 입력하시오");
			int data = sc.nextInt();
			
			if(max == data)
			{
				arr[check] = 0;
				count++;
			}
			
			if(count == 5)
			{
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
