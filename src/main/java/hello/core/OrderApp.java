package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.order.Order;
import hello.core.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        OrderService orderService = applicationContext.getBean("OrderService",OrderService.class);


        Long memberId = 1L;
        Member member = new Member(memberId,"member A ",Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itmemA",2000);
        System.out.printf("order"+order);




    }
}
