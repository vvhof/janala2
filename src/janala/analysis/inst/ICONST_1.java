/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class ICONST_1 extends Instruction {
    public ICONST_1(int iid, int mid) {
        super(iid, mid);
    }

    public void visit(IVisitor visitor) {
	visitor.visitICONST_1(this);
    }

    @Override
    public String toString() {
        return "ICONST_1 iid="+iid+" mid="+mid;
    }
}
