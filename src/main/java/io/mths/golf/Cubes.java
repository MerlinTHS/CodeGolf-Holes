package io.mths.golf;

public interface Cubes {
    static void main(String[] args) {

        for (int index = 1, cube = 1; cube < 8; ++index) {
            // the cubePlusOne variable was replaced by ++cube -> cube --
            int width = 4 + 5 * cube,
                    size = width * (3 + 3 * cube),
                    vertex1 = 2 + cube,
                    vertex2 = width - 1,
                    vertex3 = ++cube * width + 1,
                    vertex4 = vertex1 * width - vertex1,
                    vertex5 = size - cube-- * width - 1,
                    vertex6 = size - vertex2,
                    vertex7 = size - vertex1,
                    x = index % width,
                    y = index / width;


            // If the index is at the last vertex, increment cube.
            cube += index / vertex7;
            System.out.print(
                    index == vertex7 && (index = 0) < 1 // The second expression is used to reset index for the new cube.
                            ? "█\n\n"
                            : index == vertex1
                                | index == vertex2
                                | index == vertex3
                                | index == vertex4
                                | index == vertex5
                                | index == vertex6
                            ? "█"
                            : x < 1
                                ? "\n"
                                : x == 1 & index > vertex3
                                    | x == vertex2 & index < vertex5
                                    | x == width - vertex1 & index > vertex4
                                    ? "│"
                                    : vertex1 + y * vertex2 - vertex1 / width * vertex2 == index
                                        | vertex2 + y * vertex2 == index & index < vertex4
                                        | vertex5 + y * vertex2 - vertex5 / width * vertex2 == index
                                        ? "╱"
                                        : index > vertex1 & index < vertex2
                                            | index > vertex3 & index < vertex4
                                            | index > vertex6
                                            ? "─"
                                            : " "
            );
        }
    }
}