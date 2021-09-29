/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 */
class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        for (int i = 0; i < numRows; i++) {
            List<Integer> ele = new ArrayList();
            for (int j = 0; j <= i; j++) {
                if ( j==0 || j == i) {
                    ele.add(1);
                } else {
                    ele.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
                }
            }
            res.add(ele);
        }
        return res;
    }
}