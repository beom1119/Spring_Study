package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount =1000;

    @Override
    public int discount(Member memeber, int price)
    {
        if (memeber.getGrade()== Grade.VIP)
        {
            return discountFixAmount;
        }else
        {
            return 0;
        }
    }

}
