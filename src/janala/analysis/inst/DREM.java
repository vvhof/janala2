/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class DREM extends Instruction {
    public DREM(int iid, int mid) {
        super(iid, mid);
    }

    public void visit(IVisitor visitor) {
	visitor.visitDREM(this);
    }

    @Override
    public String toString() {
        return "DREM iid="+iid+" mid="+mid;
    }
}
