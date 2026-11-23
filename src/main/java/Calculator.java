import java.security.spec.RSAOtherPrimeInfo;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя");
        }
        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

    public int solver_AlexV384() {
        return add(dif(times(8, 6), div(100, 4)), 7);
    }
  
    public int solver_robos(float albedo, float sigma, float wi, float wo){
        // Oren-Nayar BRDF
        double sigmaSquared = sigma*sigma;
        double bigA = 1 - ((sigmaSquared) / 2 * (sigmaSquared + 0.33));
        double bigB = (0.45 * sigmaSquared);

        double sinThetaI = Math.sin(wi);
        double sinThetaO = Math.sin(wo);

        double maxCos = 0.0;
        if (sinThetaI > Float.MIN_VALUE && sinThetaO > Float.MIN_VALUE) {
            double sinPhiI = Math.sin(wi); double sinPhiO = Math.sin(wo);
            double cosPhiI = Math.cos(wi); double cosPhiO = Math.cos(wo);

            double dCos = cosPhiI * cosPhiO + sinPhiI * sinPhiO;
            maxCos = Math.max(maxCos, dCos);
        }
        return (int)maxCos*100;
    }
}