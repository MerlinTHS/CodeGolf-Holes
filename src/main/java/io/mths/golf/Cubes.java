package io.mths.golf;

public interface Cubes {
    static void main(String[] args) {
        var result = "";

        for (int cube = 1; cube < 8; ++cube) {
            int cubePlusOne = cube + 1,
                    width = 4 + 5 * cube,
                    height = 3 + 3 * cube,
                    size = width * height,
                    vertex1 = 2 + cube,
                    vertex2 = width - 1,
                    vertex3 = cubePlusOne * width + 1,
                    vertex4 = vertex1 * width - vertex1,
                    vertex5 = size - cubePlusOne * width - 1,
                    vertex6 = size - width + 1,
                    vertex7 = size - vertex1;

            for (int index = 1; index <= vertex7; ++index) {
                int x = index % width,
                        y = index / width;

                result += index == vertex1
                        | index == vertex2
                        | index == vertex3
                        | index == vertex4
                        | index == vertex5
                        | index == vertex6
                        | index == vertex7
                 ? "█" : x < 1
                        ? "\n" : x == 1 & index > vertex3
                        | x == vertex2 & index < vertex5
                        | x == width - vertex1 & index > vertex4
                        ? "│" : vertex1 + (y - vertex1 / width) * vertex2 == index
                        | vertex2 + (y - vertex2 / width) * vertex2 == index & index < vertex4
                        | vertex5 + (y - vertex5 / width) * vertex2 == index
                        ? "╱" : index > vertex1 & index < vertex2
                        | index > vertex3 & index < vertex4
                        | index > vertex6
                        ? "─" : " ";
            }
            result += "\n\n";
        }

        System.out.print(result);
    }
}