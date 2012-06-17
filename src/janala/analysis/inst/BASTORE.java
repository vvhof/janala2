/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class BASTORE extends Instruction {
    public BASTORE(int iid, int mid) {
        super(iid, mid);
    }

    public void visit(IVisitor visitor) {
	visitor.visitBASTORE(this);
    }

    @Override
    public String toString() {
        return "BASTORE iid="+iid+" mid="+mid;
    }
}
