package io.mths.golf;

interface ISBN {
    static void main(String[] isbns) {
        for (var isbn : isbns) {
            int checkDigit = 0, times = 10, digit;

            for (var character : isbn.getBytes())
                if (character != 45)
                    checkDigit += (character - 48) * times--;

            digit = (11 - checkDigit % 11) % 11;

            System.out.println(
                    isbn + (char) (digit > 9 ? 88 : 48 + digit)
            );
        }
    }
}