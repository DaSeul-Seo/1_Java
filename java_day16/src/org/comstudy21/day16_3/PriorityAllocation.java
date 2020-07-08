package org.comstudy21.day16_3;

public class PriorityAllocation implements Scheduler{
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옵니다.");
	}
	public void sendCallToAgent() {
		System.out.println("업무 skill값이 높은 상담원에게 우선적으로 배분합니다.");
	}
}
