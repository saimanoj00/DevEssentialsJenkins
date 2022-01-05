package MathOperations.Calculator;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;



class Calculations1Test {
Calculations c=new Calculations();
@Test
void testSumSuccess() {
Calculations op = new Calculations();
assertEquals(18, op.add(10,8));
}

@Test
void testSumInputOneFailuerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.add(2147483647,9999));
}

@Test
void testSumInputTwoFailuerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.add(1000000, 2147483647));
}

@Test
void testSumFailuer() {
Calculations op = new Calculations();
assertNotEquals(200, op.add(100,201));
}




@Test
void testSubSuccess() {
Calculations op = new Calculations();
assertEquals(92, op.sub(100,8));
}

@Test
void testSubInputOneFailuerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.sub(1000000, 2147483647));
}

@Test
void testSubInputTwoFailuerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.sub(2147483647,1000000));
}

@Test
void testSubFailure() {
Calculations op = new Calculations();
assertNotEquals(92, op.sub(200,80));
}

@Test
void testMulSuccess() {
Calculations op = new Calculations();
assertEquals(360, op.mul(12,30));
}

@Test
void testMulInputOneFailuerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.mul(214748364,10000));
}

@Test
void testMulInputTwoFailuerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.mul(2183,9900000));
}

@Test
void testMulFailure() {
Calculations op = new Calculations();
assertNotEquals(90, op.mul(20,80));
}

@Test
void testDivSuccess() {
Calculations op = new Calculations();
assertEquals(120, op.div(3600,30));
}

@Test
void testDivInputOneFailuerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.div(214748364,10000));
}

@Test
void testDivInputTwoFailuerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.div(2183,999900000));
}

@Test
void testDivExceptionFailure() {
Calculations op = new Calculations();
assertEquals(-1, op.div(200,0));
}

@Test
void testDivFailure() {
Calculations op = new Calculations();
assertNotEquals(90, op.div(200,20));
}

@Test
void testExpSuccess() {
Calculations op = new Calculations();
assertEquals(8000, op.exp(20,3));
}

@Test
void testExpBaseOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.exp(100,2));
}

@Test
void testExpPowerOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.exp(200,20));
}

@Test
void testExpFailure() {
Calculations op = new Calculations();
assertNotEquals(9000, op.div(30,5));
}

@Test
void testFactSuccess() {
Calculations op = new Calculations();
assertEquals(720, op.fact(6));
}

@Test
void testFactNumberOutOfRange() {
Calculations op = new Calculations();
assertEquals(-1, op.fact(20));
}

@Test
void testFactFailure() {
Calculations op = new Calculations();
assertNotEquals(900, op.fact(11));
}





}