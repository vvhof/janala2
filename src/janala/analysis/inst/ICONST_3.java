/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class ICONST_3 extends Instruction {
    public ICONST_3(int iid, int mid) {
        super(iid, mid);
    }

    public void visit(IVisitor visitor) {
	visitor.visitICONST_3(this);
    }

    @Override
    public String toString() {
        return "ICONST_3 iid="+iid+" mid="+mid;
    }
}
