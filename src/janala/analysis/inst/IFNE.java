/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class IFNE extends Instruction {
    int label;

    public IFNE(int iid, int mid, int label) {
        super(iid, mid);
        this.label = label;
    }

    public void visit(IVisitor visitor) {
	visitor.visitIFNE(this);
    }

    @Override
    public String toString() {
        return "IFNE iid="+iid+" mid="+mid+" label="+label;
    }
}
