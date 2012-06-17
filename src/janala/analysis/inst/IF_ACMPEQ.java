/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class IF_ACMPEQ extends Instruction {
    int label;

    public IF_ACMPEQ(int iid, int mid, int label) {
        super(iid, mid);
        this.label = label;
    }

    public void visit(IVisitor visitor) {
	visitor.visitIF_ACMPEQ(this);
    }

    @Override
    public String toString() {
        return "IF_ACMPEQ iid="+iid+" mid="+mid+" label="+label;
    }
}
