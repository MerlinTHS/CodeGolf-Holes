package io.mths.golf;

/**
 * interface ${static void main(String[]a){for(int b=0,c=1;c<8;){
 * int d=2+c,e=5*++c-1,f=e*3*c--,g=e-1,h=f/3+1,i=d*e-d,j=f-h,k=++
 * b%e,l=b/e*g;System.out.print(b==d|b==g|b==h|b==i|b==j|b==f-g||
 * b==f-d&&(b=-2)<++c?"█":k<1?"\n":k<2&b>h|k==g&b<j|k==e-d&b>i?"│
 * ":g+l==b&b<i|l+d==b|j+l-j/e*g==b?"╱":b>d&b<g|b>h&b<i|b>f-g?"─"
 * :" ");}}}
 */
interface Cubes {
    static void main(String[] args) {
        for (int index = 0, cube = 1; cube < 8;) {
            int     vertex1 = 2 + cube,
                    width = 5 * ++cube - 1,
                    size = width * 3 * cube--,
                    vertex2 = width - 1,
                    vertex3 = size / 3 + 1,
                    vertex4 = vertex1 * width - vertex1,
                    vertex5 = size - vertex3,
                    x = ++index % width,
                    y = index / width * vertex2;

            System.out.print(
                            index == vertex1
                            | index == vertex2
                            | index == vertex3
                            | index == vertex4
                            | index == vertex5
                            | index == size - vertex2
                            || index == size - vertex1 && (index = -2) < ++cube
                                ? "█"
                                : x < 1
                                    ? "\n"
                                    : x < 2 & index > vertex3
                                        | x == vertex2 & index < vertex5
                                        | x == width - vertex1 & index > vertex4
                                        ? "│"
                                        : y + vertex2 == index & index < vertex4
                                            | y + vertex1 == index
                                            | vertex5 + y - vertex5 / width * vertex2 == index
                                        ? "╱"
                                        : index > vertex1 & index < vertex2
                                            | index > vertex3 & index < vertex4
                                            | index > size - vertex2
                                            ? "─"
                                            : " "
            );
        }
    }
}
