package com.intexsoft.lessons0801.thread.chicken;

public class ChickenVoice // ����� � ������� main()
{

	public static void main(String[] args) throws InterruptedException {
		EggVoice eggVoiceThread = new EggVoice(); // �������� ������
		System.out.println("���� �����...");
		eggVoiceThread.start(); // ������ ������

		for (int i = 0; i < 5; i++) {
			Thread.sleep(1000); // ���������������� ����� �� 1 �������

			System.out.println("������!");
		}

		// ����� ������� ������� 5 ���

		if (eggVoiceThread.isAlive()) // ���� �������� ��� �� ������ ��������� �����
		{
			eggVoiceThread.join(); // ��������� ���� �������� �������� �������������.

			System.out.println("������ ��������� ����!");
		} else {// ���� �������� ��� �������� �������������
		
			System.out.println("������ ��������� ������!");
		}
		System.out.println("���� ��������!");
	}
}