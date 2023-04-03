package io.mths.golf;

/**
 * interface ${static void main(String[]a){for(int b=0,c=1;c<8;){
 * int d=2+c,e=5*++c-1,f=e*3*c--,g=e-1,h=f/3+1,i=d*e-d,j=f-h,k=f-
 * g,l=f-d,m=++b%e,n=b/e*g;c+=b/l;System.out.print(b==d|b==g|b==h
 * |b==i|b==j|b==k||b==l&&(b=-2)<1?"█":m<1?"\n":m<2&b>h|m==g&b<j|
 * m==e-d&b>i?"│":d+n-d/e*g==b|g+n==b&b<i|j+n-j/e*g==b?"╱":b>d&b<
 * g|b>h&b<i|b>k?"─":" ");}}}
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
                    vertex6 = size - vertex2,
                    vertex7 = size - vertex1,
                    x = ++index % width,
                    y = index / width * vertex2;

            // If the index is at the last vertex, increment cube.
            cube += index / vertex7;
            System.out.print(
                            index == vertex1
                            | index == vertex2
                            | index == vertex3
                            | index == vertex4
                            | index == vertex5
                            | index == vertex6
                            || index == vertex7 && (index = -2) < 1 // ++i < ++i (7) instead of (i=-2) < 1 (8)?
                                ? "█"
                                : x < 1
                                    ? "\n"
                                    : x < 2 & index > vertex3
                                        | x == vertex2 & index < vertex5
                                        | x == width - vertex1 & index > vertex4
                                        ? "│"
                                        : vertex1 + y - vertex1 / width * vertex2 == index
                                            | vertex2 + y == index & index < vertex4
                                            | vertex5 + y - vertex5 / width * vertex2 == index
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
