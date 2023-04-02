package io.mths.golf;

public interface Cubes {
    static void main(String[] args) {
        var result = "";

        for (int cube = 1; cube < 8; ++cube) {
            int padding = 2 + cube,
                    width = 4 + 5 * cube,
                    height = 3 + 3 * cube,
                    vertex1 = padding,
                    vertex2 = width - 1,
                    vertex3 = ((cube + 1) * width) + 1,
                    vertex4 = ((cube + 2) * width) - padding,
                    vertex5 = width * height - (cube + 1) * width - 1,
                    vertex6 = width * height - width + 1,
                    vertex7 = width * height - padding;

            for (int index = 1; index <= vertex7; ++index) {
                int x = index % width,
                        y = index / width;

                if (index == vertex1
                        || index == vertex2
                        || index == vertex3
                        || index == vertex4
                        || index == vertex5
                        || index == vertex6
                        || index == vertex7
                ) {
                    result += "█";
                } else if (x == 0) {
                    result += "\n";
                }  else if ((x == 1 && index > vertex3)
                        || (x == width - 1 && index < vertex5)
                        || (x == width - padding && index > vertex4)) {
                    result += "│";
                } else if ((vertex1 + (y - vertex1 / width) * (width - 1)) == index
                        || ((vertex2 + (y - vertex2 / width) * (width - 1)) == index && index < vertex4)
                        || (vertex5 + (y - vertex5 / width) * (width - 1)) == index
                ) {
                    result += "╱";
                } else if(index > vertex1 && index < vertex2
                        || index > vertex3 && index < vertex4
                        || index > vertex6 && index < vertex7
                ) {
                    result += "─";
                } else {
                    result += " ";
                }
            }
            result += "\n\n";
        }

        System.out.print(result);
    }
}