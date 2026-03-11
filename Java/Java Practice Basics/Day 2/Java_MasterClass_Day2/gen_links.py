
import urllib.parse

def encode_java(name, code):
    prefix = "public class MainClass {\n  public static void main(String[] args) {\n    "
    suffix = "\n  }\n}"
    full_code = prefix + code + suffix
    return f"{name}: https://pythontutor.com/java.html?py=java&cumulative=false#code=" + urllib.parse.quote(full_code)

codes = {
    "sum_digits": "int n=1234, s=0;\n    while(n>0) {\n        s += n%10;\n        n /= 10;\n    }\n    System.out.println(\"Sum: \" + s);",
    "count_digits": "int n=98765, count=0;\n    while(n>0) {\n        n /= 10;\n        count++;\n    }\n    System.out.println(\"Digits: \" + count);",
    "primes": "for (int n = 2; n <= 20; n++) {\n        boolean isPrime = true;\n        for (int i = 2; i <= Math.sqrt(n); i++) {\n            if (n % i == 0) { isPrime = false; break; }\n        }\n        if (isPrime) System.out.print(n + \" \");\n    }",
    "fizzbuzz": "for (int i = 1; i <= 20; i++) {\n        if (i % 3 == 0 && i % 5 == 0) System.out.println(\"FizzBuzz\");\n        else if (i % 3 == 0) System.out.println(\"Fizz\");\n        else if (i % 5 == 0) System.out.println(\"Buzz\");\n        else System.out.println(i);\n    }",
    "reverse": "int n = 1234, rev = 0;\n    while (n != 0) {\n        rev = rev * 10 + (n % 10);\n        n /= 10;\n    }\n    System.out.println(\"Reversed: \" + rev);",
    "factorial": "long fact = 1;\n    for(int i=1; i<=5; i++) fact *= i;\n    System.out.println(\"Factorial: \" + fact);",
    "triangle": "for (int i = 1; i <= 5; i++) {\n        for (int j = 1; j <= i; j++) {\n            System.out.print(\"* \");\n        }\n        System.out.println();\n    }",
    "inverted": "for (int i = 5; i >= 1; i--) {\n        for (int j = 1; j <= i; j++) {\n            System.out.print(\"* \");\n        }\n        System.out.println();\n    }",
    "pyramid": "for (int i = 1; i <= 3; i++) {\n        for (int j = 1; j <= i; j++) {\n            System.out.print(j + \" \");\n        }\n        System.out.println();\n    }",
    "floyd": "int count = 1;\n    for (int i = 1; i <= 4; i++) {\n        for (int j = 1; j <= i; j++) {\n            System.out.print(count++ + \" \");\n        }\n        System.out.println();\n    }",
    "pascal": "for (int i = 0; i < 5; i++) {\n        int num = 1;\n        for (int j = 0; j <= i; j++) {\n            System.out.print(num + \" \");\n            num = num * (i - j) / (j + 1);\n        }\n        System.out.println();\n    }"
}

with open("links.txt", "w") as f:
    for name, code in codes.items():
        f.write(encode_java(name, code) + "\n")
