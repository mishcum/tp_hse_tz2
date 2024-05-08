package com.example;

import static org.junit.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.math.BigInteger;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class AppTest {

    @Test
    public void Test_min() throws FileNotFoundException {
        App Test1 = new App("src/test/java/com/example/test1.txt");
        assertEquals(new BigInteger("11"), Test1._min());
        
    }

    @Test
    public void Test_max() throws FileNotFoundException {
        App Test1 = new App("src/test/java/com/example/test1.txt");
        assertEquals(new BigInteger("50"), Test1._max());
    }

    @Test
    public void Test_sum() throws FileNotFoundException {
        App Test1 = new App("src/test/java/com/example/test1.txt");
        assertEquals(new BigInteger("1233"), Test1._sum());
    }

    @Test 
    public void Test_mult() throws FileNotFoundException {
        App Test1 = new App("src/test/java/com/example/test1.txt");
        assertEquals(new BigInteger("8871426289131359208945645691225630756211340041256960000000000000"), Test1._mult());
    }
    //___________________________________________________________________________
    @Test
    public void Test2_min() throws FileNotFoundException {
        App Test2 = new App("src/test/java/com/example/test2.txt");
        assertEquals(new BigInteger("1"), Test2._min());
    }

    @Test
    public void Test2_max() throws FileNotFoundException {
        App Test2 = new App("src/test/java/com/example/test2.txt");
        assertEquals(new BigInteger("50"), Test2._max());
    }

    @Test
    public void Test2_sum() throws FileNotFoundException {
        App Test2 = new App("src/test/java/com/example/test2.txt");
        assertEquals(new BigInteger("12935"), Test2._sum());
    }

    @Test 
    public void Test2_mult() throws FileNotFoundException {
        App Test2 = new App("src/test/java/com/example/test2.txt");
        assertEquals(new BigInteger("4924209359997337890886106508781787390970365621412681212837480299623323233963964684092665796056520706811952995429328650656703761578943627776989608420943804668697847519281355975263388571617462572579889654740874574567291445155126561248021735996432357033603786211041397921960626464329012724733946873821421345262919245255704922835408444504299677522756625486570622237110449866503560438628497128760552884081453526148240012704162058492496041110602291975535274503267314796834914924559656302550910806160291877766394019840000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"), Test2._mult());
    }
    //___________________________________________________________________________
    @Test
    public void Test3_min() throws FileNotFoundException {
        App Test3 = new App("src/test/java/com/example/test3.txt");
        assertEquals(new BigInteger("1"), Test3._min());
    }

    @Test
    public void Test3_max() throws FileNotFoundException {
        App Test3 = new App("src/test/java/com/example/test3.txt");
        assertEquals(new BigInteger("50"), Test3._max());
    }

    @Test
    public void Test3_sum() throws FileNotFoundException {
        App Test3 = new App("src/test/java/com/example/test3.txt");
        assertEquals(new BigInteger("26305"), Test3._sum());
    }

    @Test 
    public void Test3_mult() throws FileNotFoundException {
        App Test3 = new App("src/test/java/com/example/test3.txt");
        assertEquals(new BigInteger("4840509417796430050026413760723809925977417748283077535799305018323849121156771319127119143516631752354015915763647630445606535957337507018307729949578475684419436032529992543420733000123362642017919443757910472463228618053128680766008815831081221282251854959136771415885992682991113127845779803242602673591371173603816695177354048980395227409961543823041891848223538846361382598559825142113331994878544902682139780612481195463834977497988975462167634567342029146305635839657119005946394017380496645157886107754323636569099774207441698723490211797619089026290827373126146765378308224542522740901775095544655005737407581855296627068832286496976695419877783257351436461808296179975538332301982350427254472875516033634944502617381261421485353618462569625737485799975091615149944412802166519531423185157881809018746821938839923425237091218583743679686648913827767769664691038550810695318143459640719396669653827209090787644964565817007530575718156749984154969615215622164061411716418054026182140496142810320796403988344512393037395603080813455373111828461531675577496371200000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"), Test3._mult());
    }
    //___________________________________________________________________________
    @Test
    public void Test4_min() throws FileNotFoundException {
        App Test4 = new App("src/test/java/com/example/test4.txt");
        assertEquals(new BigInteger("-100"), Test4._min());
    }

    @Test
    public void Test4_max() throws FileNotFoundException {
        App Test4 = new App("src/test/java/com/example/test4.txt");
        assertEquals(new BigInteger("100"), Test4._max());
    }

    @Test
    public void Test4_sum() throws FileNotFoundException {
        App Test4 = new App("src/test/java/com/example/test4.txt");
        assertEquals(new BigInteger("5154"), Test4._sum());
    }

    @Test 
    public void Test4_mult() throws FileNotFoundException {
        App Test4 = new App("src/test/java/com/example/test4.txt");
        assertEquals(new BigInteger("0"), Test4._mult());
    }
    //___________________________________________________________________________
    @Test
    public void Test5_min() throws FileNotFoundException {
        App Test5 = new App("src/test/java/com/example/test5.txt");
        assertEquals(new BigInteger("-10000"), Test5._min());
    }

    @Test
    public void Test5_max() throws FileNotFoundException {
        App Test5 = new App("src/test/java/com/example/test5.txt");
        assertEquals(new BigInteger("10000"), Test5._max());
    }

    @Test
    public void Test5_sum() throws FileNotFoundException {
        App Test5 = new App("src/test/java/com/example/test5.txt");
        assertEquals(new BigInteger("-8545648"), Test5._sum());
    }

    @Test 
    public void Test5_mult() throws FileNotFoundException {
        App Test5 = new App("src/test/java/com/example/test5.txt");
        assertEquals(new BigInteger("0"), Test5._mult());
    }
    
}
