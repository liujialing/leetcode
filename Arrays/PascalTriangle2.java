/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 *
 * 链接：https://leetcode-cn.com/problems/pascals-triangle-ii
 */
class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> ele = new ArrayList();
            int size = i + 1;
            for (int j = 0; j < size; j++) {
                if (j == 0 || j == (size - 1)) {
                    ele.add(1);
                } else {
                    ele.add(ans.get(i - 1).get(j-1)+ ans.get(i-1).get(j));
                }
            }
            ans.add(ele);
        }
        return ans.get(rowIndex);
    }
}