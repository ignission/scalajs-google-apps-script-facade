package facade.googleappsscript.optimization

import scala.scalajs.js
import scala.scalajs.js.annotation._

@js.native
trait LinearOptimizationConstraint extends js.Object {
  def setCoefficient(variableName: String, coefficient: Double): LinearOptimizationConstraint =
    js.native
}

@js.native
trait LinearOptimizationEngine extends js.Object {
  def addConstraint(lowerBound: Double, upperBound: Double): LinearOptimizationConstraint =
    js.native
  def addConstraints(
      lowerBounds: js.Array[Double],
      upperBounds: js.Array[Double],
      variableNames: js.Array[js.Array[String]],
      coefficients: js.Array[js.Array[Double]]
  ): LinearOptimizationEngine = js.native
  def addVariable(name: String, lowerBound: Double, upperBound: Double): LinearOptimizationEngine =
    js.native
  def addVariable(
      name: String,
      lowerBound: Double,
      upperBound: Double,
      `type`: VariableType
  ): LinearOptimizationEngine = js.native
  def addVariable(
      name: String,
      lowerBound: Double,
      upperBound: Double,
      `type`: VariableType,
      objectiveCoefficient: Double
  ): LinearOptimizationEngine = js.native
  def addVariables(
      names: js.Array[String],
      lowerBounds: js.Array[Double],
      upperBounds: js.Array[Double],
      types: js.Array[VariableType],
      objectiveCoefficients: js.Array[Double]
  ): LinearOptimizationEngine                     = js.native
  def setMaximization(): LinearOptimizationEngine = js.native
  def setMinimization(): LinearOptimizationEngine = js.native
  def setObjectiveCoefficient(
      variableName: String,
      coefficient: Double
  ): LinearOptimizationEngine                            = js.native
  def solve(): LinearOptimizationSolution                = js.native
  def solve(seconds: Double): LinearOptimizationSolution = js.native
}

@js.native
trait LinearOptimizationService extends js.Object {
  var Status: Status                           = js.native
  var VariableType: VariableType               = js.native
  def createEngine(): LinearOptimizationEngine = js.native
}

@js.native
trait LinearOptimizationSolution extends js.Object {
  def getObjectiveValue(): Double                    = js.native
  def getStatus(): Status                            = js.native
  def getVariableValue(variableName: String): Double = js.native
  def isValid(): Boolean                             = js.native
}

@js.native
sealed trait Status extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Optimization.Status")
object Status extends js.Object {
  var OPTIMAL: Status       = js.native
  var FEASIBLE: Status      = js.native
  var INFEASIBLE: Status    = js.native
  var UNBOUNDED: Status     = js.native
  var ABNORMAL: Status      = js.native
  var MODEL_INVALID: Status = js.native
  var NOT_SOLVED: Status    = js.native
  @JSBracketAccess
  def apply(value: Status): String = js.native
}

@js.native
sealed trait VariableType extends js.Object {}

@js.native
@JSGlobal("GoogleAppsScript.Optimization.VariableType")
object VariableType extends js.Object {
  var INTEGER: VariableType    = js.native
  var CONTINUOUS: VariableType = js.native
  @JSBracketAccess
  def apply(value: VariableType): String = js.native
}
