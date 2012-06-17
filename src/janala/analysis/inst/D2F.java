/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class D2F extends Instruction {
    public D2F(int iid, int mid) {
        super(iid, mid);
    }

    public void visit(IVisitor visitor) {
	visitor.visitD2F(this);
    }

    @Override
    public String toString() {
        return "D2F iid="+iid+" mid="+mid;
    }
}
