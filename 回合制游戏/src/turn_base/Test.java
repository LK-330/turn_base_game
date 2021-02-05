package turn_base;

import javax.security.sasl.SaslServer;

/*
 * 回合制游戏的需求
 *        1.玩家
 *             血量
 *             基础攻击力（物理攻击/法术攻击）
 *             基础防御力（物理/法术）
 *             敏捷度（随机生成）
 *                   武器（需购买，然后进行选择）
 *                        攻击力（物理/法术）
 *                        耐久度
 *                       暴击率
 *                  防具（需购买，然后进行选择）
 *                       防御力（物理/法术）
 *                       闪避率
 *                       耐久度
 *       2.10回合制
 *             每回合先手攻击的玩家是由敏捷度决定的
 *             一个回合两个玩家分别都得进行攻击和防御操作
 *             每回合之后，都会输出两个玩家的剩余血量
 *             每次攻击都会显示攻击伤害值，抵挡伤害值
 *             最后血量剩余最多的玩家获胜
 *       3.
 *         攻击
 *         防御
 *       * */
public class Test extends Method {
       public static void main(String[] args)
       {
           Test t=new Test();

        t.Narrator();
        System.out.println("------------------------------------------");
         t.boundary1();
         t.choose1();


       }
}
