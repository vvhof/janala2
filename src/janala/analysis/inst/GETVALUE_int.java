/*
 * Author: Koushik Sen (ksen@cs.berkeley.edu)
 */

package janala.analysis.inst;

public class GETVALUE_int extends Instruction {
    int v;

    public GETVALUE_int(int v) {
        super(-1, -1);
        this.v = v;
    }

    public void visit(IVisitor visitor) {
	visitor.visitGETVALUE_int(this);
    }

    @Override
    public String toString() {
        return "GETVALUE_int v="+v;
    }
}
