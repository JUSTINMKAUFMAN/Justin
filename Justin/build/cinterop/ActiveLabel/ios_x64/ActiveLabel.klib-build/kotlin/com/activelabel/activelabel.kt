@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION", "CONFLICTING_OVERLOADS", "RETURN_TYPE_MISMATCH_ON_INHERITANCE", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "WRONG_MODIFIER_CONTAINING_DECLARATION", "PARAMETER_NAME_CHANGED_ON_OVERRIDE", "UNUSED_PARAMETER", "MANY_IMPL_MEMBER_NOT_IMPLEMENTED", "MANY_INTERFACES_MEMBER_NOT_IMPLEMENTED", "EXTENSION_SHADOWED_BY_MEMBER", "REDUNDANT_NULLABLE", "DEPRECATION")
package com.activelabel

import kotlin.native.SymbolName
import kotlinx.cinterop.*
import cnames.structs._NSZone
import kotlin.collections.List
import objcnames.classes.Protocol
import platform.CoreGraphics.CGFloat
import platform.CoreGraphics.CGRect
import platform.CoreGraphics.CGSize
import platform.Foundation.NSCoder
import platform.Foundation.NSError
import platform.Foundation.NSErrorDomain
import platform.UIKit.UIAppearanceContainerProtocol
import platform.UIKit.UIColor
import platform.UIKit.UIFont
import platform.UIKit.UIInteractionProtocol
import platform.UIKit.UIInteractionProtocolMeta
import platform.UIKit.UILabel
import platform.UIKit.UILabelMeta
import platform.UIKit.UITraitCollection
import platform.UIKit.UIView
import platform.darwin.NSInteger
import platform.darwin.NSIntegerVar
import platform.darwin.NSObject
import platform.darwin.NSObjectMeta
import platform.darwin.NSObjectProtocol
import platform.darwin.NSObjectProtocolMeta
import platform.darwin.NSUInteger
import platform.posix.uint_least16_t
import platform.posix.uint_least32_t

// NOTE THIS FILE IS AUTO-GENERATED

fun UIGuidedAccessRestrictionStateForIdentifier(restrictionIdentifier: String): UIGuidedAccessRestrictionState {
    return UIGuidedAccessRestrictionState.byValue(kniBridge0(restrictionIdentifier.objcPtr()))
}

fun UIGuidedAccessConfigureAccessibilityFeatures(features: UIGuidedAccessAccessibilityFeature, enabled: Boolean, completion: (Boolean, NSError?) -> Unit): Unit {
    return kniBridge1(features, enabled.toByte(), createKotlinObjectHolder(completion))
}

@ExternalObjCClass("kniprot_com_activelabel0") interface UIGuidedAccessRestrictionDelegateProtocolMeta : NSObjectProtocolMeta {
}

@ExternalObjCClass("kniprot_com_activelabel0") interface UIGuidedAccessRestrictionDelegateProtocol : NSObjectProtocol {
    
    final val guidedAccessRestrictionIdentifiers: List<*>?
        get() = objcKniBridge8(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("guidedAccessRestrictionWithIdentifier:didChangeState:", "objcKniBridge2")
    fun guidedAccessRestrictionWithIdentifier(restrictionIdentifier: String, didChangeState: UIGuidedAccessRestrictionState): Unit
    
    @ObjCMethod("textForGuidedAccessRestrictionWithIdentifier:", "objcKniBridge4")
    fun textForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier: String): String?
    
    @ObjCMethod("detailTextForGuidedAccessRestrictionWithIdentifier:", "objcKniBridge6")
    fun detailTextForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier: String): String? = optional()
    
    @ObjCMethod("guidedAccessRestrictionIdentifiers", "objcKniBridge8")
    fun guidedAccessRestrictionIdentifiers(): List<*>?
}

@ExternalObjCClass("kniprot_com_activelabel9") interface UIPencilInteractionDelegateProtocolMeta : NSObjectProtocolMeta {
}

@ExternalObjCClass("kniprot_com_activelabel9") interface UIPencilInteractionDelegateProtocol : NSObjectProtocol {
    
    @ObjCMethod("pencilInteractionDidTap:", "objcKniBridge11")
    fun pencilInteractionDidTap(interaction: UIPencilInteraction): Unit = optional()
}

@ExternalObjCClass open class UIPencilInteractionMeta : NSObjectMeta, UIInteractionProtocolMeta {
    
    val preferredTapAction: UIPencilPreferredAction
        get() = objcKniBridge13(nativeNullPtr, this.objcPtr())
    
    @ObjCMethod("preferredTapAction", "objcKniBridge13")
    external open fun preferredTapAction(): UIPencilPreferredAction
    
    @ObjCMethod("new", "objcKniBridge15")
    external override fun new(): UIPencilInteraction?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge17")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): UIPencilInteraction?
    
    @ObjCMethod("alloc", "objcKniBridge19")
    external override fun alloc(): UIPencilInteraction?
    
    protected constructor() {}
}

@ExternalObjCClass open class UIPencilInteraction : NSObject, UIInteractionProtocol {
    companion object : UIPencilInteractionMeta(), ObjCClassOf<UIPencilInteraction> {}
    
    var delegate: UIPencilInteractionDelegateProtocol?
        get() = objcKniBridge21(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge23(nativeNullPtr, this.objcPtr(), value)
    
    var enabled: Boolean
        get() = objcKniBridge25(nativeNullPtr, this.objcPtr())
        set(value) = objcKniBridge27(nativeNullPtr, this.objcPtr(), value)
    
    @ObjCMethod("delegate", "objcKniBridge21")
    external open fun delegate(): UIPencilInteractionDelegateProtocol?
    
    @ObjCMethod("setDelegate:", "objcKniBridge23")
    external open fun setDelegate(delegate: UIPencilInteractionDelegateProtocol?): Unit
    
    @ObjCMethod("isEnabled", "objcKniBridge25")
    external open fun isEnabled(): Boolean
    
    @ObjCMethod("setEnabled:", "objcKniBridge27")
    external open fun setEnabled(enabled: Boolean): Unit
    
    @ObjCMethod("init", "objcKniBridge29")
    external override fun init(): UIPencilInteraction?
    
    @ObjCConstructor("init", true)
    constructor() {}
    
    @ObjCMethod("willMoveToView:", "objcKniBridge31")
    external override fun willMoveToView(view: UIView?): Unit
    
    @ObjCMethod("didMoveToView:", "objcKniBridge33")
    external override fun didMoveToView(view: UIView?): Unit
    
    @ObjCMethod("view", "objcKniBridge35")
    external override fun view(): UIView?
    
    @ObjCMethod("isEqual:", "objcKniBridge37")
    external override fun isEqual(`object`: Any?): Boolean
    
    @ObjCMethod("class", "objcKniBridge39")
    external override fun `class`(): ObjCClass?
    
    @ObjCMethod("performSelector:", "objcKniBridge41")
    external override fun performSelector(aSelector: COpaquePointer?): Any?
    
    @ObjCMethod("performSelector:withObject:", "objcKniBridge43")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?): Any?
    
    @ObjCMethod("performSelector:withObject:withObject:", "objcKniBridge45")
    external override fun performSelector(aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any?
    
    @ObjCMethod("isProxy", "objcKniBridge47")
    external override fun isProxy(): Boolean
    
    @ObjCMethod("isKindOfClass:", "objcKniBridge49")
    external override fun isKindOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("isMemberOfClass:", "objcKniBridge51")
    external override fun isMemberOfClass(aClass: ObjCClass?): Boolean
    
    @ObjCMethod("conformsToProtocol:", "objcKniBridge53")
    external override fun conformsToProtocol(aProtocol: Protocol?): Boolean
    
    @ObjCMethod("respondsToSelector:", "objcKniBridge55")
    external override fun respondsToSelector(aSelector: COpaquePointer?): Boolean
    
    @ObjCMethod("hash", "objcKniBridge57")
    external override fun hash(): NSUInteger
    
    @ObjCMethod("superclass", "objcKniBridge59")
    external override fun superclass(): ObjCClass?
    
    @ObjCMethod("description", "objcKniBridge61")
    external override fun description(): String?
    
    @ObjCMethod("debugDescription", "objcKniBridge63")
    external override fun debugDescription(): String?
}

@ExternalObjCClass("", "_TtC11ActiveLabel11ActiveLabel") open class ActiveLabelMeta : UILabelMeta {
    
    @ObjCMethod("new", "objcKniBridge65")
    external override fun new(): ActiveLabel?
    
    @ObjCMethod("allocWithZone:", "objcKniBridge67")
    external override fun allocWithZone(zone: CPointer<_NSZone>?): ActiveLabel?
    
    @ObjCMethod("alloc", "objcKniBridge69")
    external override fun alloc(): ActiveLabel?
    
    @ObjCMethod("appearance", "objcKniBridge71")
    external override fun appearance(): ActiveLabel
    
    @ObjCMethod("appearanceWhenContainedIn:", "objcKniBridge73")
    external override fun appearanceWhenContainedIn(ContainerClass: UIAppearanceContainerProtocol?): ActiveLabel
    
    @ObjCMethod("appearanceWhenContainedInInstancesOfClasses:", "objcKniBridge75")
    external override fun appearanceWhenContainedInInstancesOfClasses(containerTypes: List<*>): ActiveLabel
    
    @ObjCMethod("appearanceForTraitCollection:", "objcKniBridge77")
    external override fun appearanceForTraitCollection(trait: UITraitCollection): ActiveLabel
    
    @ObjCMethod("appearanceForTraitCollection:whenContainedIn:", "objcKniBridge79")
    external override fun appearanceForTraitCollection(trait: UITraitCollection, whenContainedIn: UIAppearanceContainerProtocol?): ActiveLabel
    
    @ObjCMethod("appearanceForTraitCollection:whenContainedInInstancesOfClasses:", "objcKniBridge81")
    external override fun appearanceForTraitCollection(trait: UITraitCollection, whenContainedInInstancesOfClasses: List<*>): ActiveLabel
    
    protected constructor() {}
}

@ExternalObjCClass("", "_TtC11ActiveLabel11ActiveLabel") open class ActiveLabel : UILabel {
    companion object : ActiveLabelMeta(), ObjCClassOf<ActiveLabel> {}
    
    @ObjCMethod("awakeFromNib", "objcKniBridge83")
    external open fun awakeFromNib(): Unit
    
    @ObjCMethod("mentionColor", "objcKniBridge85")
    external open fun mentionColor(): UIColor
    
    @ObjCMethod("setMentionColor:", "objcKniBridge87")
    external open fun setMentionColor(mentionColor: UIColor): Unit
    
    @ObjCMethod("mentionSelectedColor", "objcKniBridge89")
    external open fun mentionSelectedColor(): UIColor?
    
    @ObjCMethod("setMentionSelectedColor:", "objcKniBridge91")
    external open fun setMentionSelectedColor(mentionSelectedColor: UIColor?): Unit
    
    @ObjCMethod("hashtagColor", "objcKniBridge93")
    external open fun hashtagColor(): UIColor
    
    @ObjCMethod("setHashtagColor:", "objcKniBridge95")
    external open fun setHashtagColor(hashtagColor: UIColor): Unit
    
    @ObjCMethod("hashtagSelectedColor", "objcKniBridge97")
    external open fun hashtagSelectedColor(): UIColor?
    
    @ObjCMethod("setHashtagSelectedColor:", "objcKniBridge99")
    external open fun setHashtagSelectedColor(hashtagSelectedColor: UIColor?): Unit
    
    @ObjCMethod("URLColor", "objcKniBridge101")
    external open fun URLColor(): UIColor
    
    @ObjCMethod("setURLColor:", "objcKniBridge103")
    external open fun setURLColor(URLColor: UIColor): Unit
    
    @ObjCMethod("URLSelectedColor", "objcKniBridge105")
    external open fun URLSelectedColor(): UIColor?
    
    @ObjCMethod("setURLSelectedColor:", "objcKniBridge107")
    external open fun setURLSelectedColor(URLSelectedColor: UIColor?): Unit
    
    @ObjCMethod("lineSpacing", "objcKniBridge109")
    external open fun lineSpacing(): CGFloat
    
    @ObjCMethod("setLineSpacing:", "objcKniBridge111")
    external open fun setLineSpacing(lineSpacing: CGFloat): Unit
    
    @ObjCMethod("minimumLineHeight", "objcKniBridge113")
    external open fun minimumLineHeight(): CGFloat
    
    @ObjCMethod("setMinimumLineHeight:", "objcKniBridge115")
    external open fun setMinimumLineHeight(minimumLineHeight: CGFloat): Unit
    
    @ObjCMethod("highlightFontName", "objcKniBridge117")
    external open fun highlightFontName(): String?
    
    @ObjCMethod("setHighlightFontName:", "objcKniBridge119")
    external open fun setHighlightFontName(highlightFontName: String?): Unit
    
    @ObjCMethod("font", "objcKniBridge121")
    external override fun font(): UIFont?
    
    @ObjCMethod("setFont:", "objcKniBridge123")
    external override fun setFont(font: UIFont?): Unit
    
    @ObjCMethod("textColor", "objcKniBridge125")
    external override fun textColor(): UIColor?
    
    @ObjCMethod("setTextColor:", "objcKniBridge127")
    external override fun setTextColor(textColor: UIColor?): Unit
    
    @ObjCMethod("intrinsicContentSize", "objcKniBridge129")
    external open fun intrinsicContentSize(): CValue<CGSize>
    
    @ObjCMethod("initWithFrame:", "objcKniBridge131")
    external override fun initWithFrame(frame: CValue<CGRect>): ActiveLabel
    
    @ObjCConstructor("initWithFrame:", true)
    constructor(frame: CValue<CGRect>) {}
    
    @ObjCMethod("initWithCoder:", "objcKniBridge133")
    external override fun initWithCoder(aDecoder: NSCoder): ActiveLabel?
    
    @ObjCConstructor("initWithCoder:", true)
    constructor(coder: NSCoder) {}
    
    @ObjCMethod("init", "objcKniBridge135")
    external override fun init(): ActiveLabel?
    
    @ObjCConstructor("init", false)
    constructor() {}
}

const val SWIFT_TYPEDEFS: Int = 1

val UIGuidedAccessErrorDomain: NSErrorDomain?
    get() = interpretObjCPointerOrNull<String>(kniBridge137())

var ActiveLabelVersionNumber: Double
    get() = kniBridge138()
    set(value) { kniBridge139(value) }

val ActiveLabelVersionString: CArrayPointer<UByteVar>
    get() = interpretCPointer<UByteVar>(kniBridge140())!!

typealias UIGuidedAccessErrorCodeVar = LongVarOf<UIGuidedAccessErrorCode>
typealias UIGuidedAccessErrorCode = NSInteger

val UIGuidedAccessErrorPermissionDenied: UIGuidedAccessErrorCode get() = 0
val UIGuidedAccessErrorFailed: UIGuidedAccessErrorCode get() = 9223372036854775807

enum class UIGuidedAccessRestrictionState(override val value: NSInteger) : CEnum {
    UIGuidedAccessRestrictionStateAllow(0),
    UIGuidedAccessRestrictionStateDeny(1),
    ;
    
    companion object {
        fun byValue(value: NSInteger) = UIGuidedAccessRestrictionState.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(NSIntegerVar.size.toInt())
        var value: UIGuidedAccessRestrictionState
            get() = byValue(this.reinterpret<NSIntegerVar>().value)
            set(value) { this.reinterpret<NSIntegerVar>().value = value.value }
    }
}

typealias UIGuidedAccessAccessibilityFeatureVar = ULongVarOf<UIGuidedAccessAccessibilityFeature>
typealias UIGuidedAccessAccessibilityFeature = NSUInteger

val UIGuidedAccessAccessibilityFeatureVoiceOver: UIGuidedAccessAccessibilityFeature get() = 1u
val UIGuidedAccessAccessibilityFeatureZoom: UIGuidedAccessAccessibilityFeature get() = 2u
val UIGuidedAccessAccessibilityFeatureAssistiveTouch: UIGuidedAccessAccessibilityFeature get() = 4u
val UIGuidedAccessAccessibilityFeatureInvertColors: UIGuidedAccessAccessibilityFeature get() = 8u
val UIGuidedAccessAccessibilityFeatureGrayscaleDisplay: UIGuidedAccessAccessibilityFeature get() = 16u

typealias UIPencilPreferredActionVar = LongVarOf<UIPencilPreferredAction>
typealias UIPencilPreferredAction = NSInteger

val UIPencilPreferredActionIgnore: UIPencilPreferredAction get() = 0
val UIPencilPreferredActionSwitchEraser: UIPencilPreferredAction get() = 1
val UIPencilPreferredActionSwitchPrevious: UIPencilPreferredAction get() = 2
val UIPencilPreferredActionShowColorPalette: UIPencilPreferredAction get() = 3

typealias char16_tVar = UShortVarOf<char16_t>
typealias char16_t = uint_least16_t

typealias char32_tVar = UIntVarOf<char32_t>
typealias char32_t = uint_least32_t

@kotlin.native.internal.ExportForCompiler
@ObjCBridge("guidedAccessRestrictionWithIdentifier:didChangeState:", "v32@0:8@16q24", "knimi_com_activelabel1")
internal fun objcKniBridge2(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String, didChangeState: UIGuidedAccessRestrictionState): Unit {
    return kniBridge3(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr(), didChangeState.value)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("textForGuidedAccessRestrictionWithIdentifier:", "@24@0:8@16", "knimi_com_activelabel3")
internal fun objcKniBridge4(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String): String? {
    return interpretObjCPointerOrNull<String>(kniBridge5(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("detailTextForGuidedAccessRestrictionWithIdentifier:", "@24@0:8@16", "knimi_com_activelabel5")
internal fun objcKniBridge6(kniSC: NativePtr, kniR: NativePtr, restrictionIdentifier: String): String? {
    return interpretObjCPointerOrNull<String>(kniBridge7(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, restrictionIdentifier.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("guidedAccessRestrictionIdentifiers", "@16@0:8", "knimi_com_activelabel7")
internal fun objcKniBridge8(kniSC: NativePtr, kniR: NativePtr): List<*>? {
    return interpretObjCPointerOrNull<List<*>>(kniBridge9(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("pencilInteractionDidTap:", "v24@0:8@16", "knimi_com_activelabel10")
internal fun objcKniBridge11(kniSC: NativePtr, kniR: NativePtr, interaction: UIPencilInteraction): Unit {
    return kniBridge11(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, interaction.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("preferredTapAction", "q16@0:8", "knimi_com_activelabel12")
internal fun objcKniBridge13(kniSC: NativePtr, kniR: NativePtr): UIPencilPreferredAction {
    return kniBridge13(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_activelabel14")
internal fun objcKniBridge15(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge15(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_activelabel16")
internal fun objcKniBridge17(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge17(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_activelabel18")
internal fun objcKniBridge19(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge19(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("delegate", "@16@0:8", "knimi_com_activelabel20")
internal fun objcKniBridge21(kniSC: NativePtr, kniR: NativePtr): UIPencilInteractionDelegateProtocol? {
    return interpretObjCPointerOrNull<UIPencilInteractionDelegateProtocol>(kniBridge21(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setDelegate:", "v24@0:8@16", "knimi_com_activelabel22")
internal fun objcKniBridge23(kniSC: NativePtr, kniR: NativePtr, delegate: UIPencilInteractionDelegateProtocol?): Unit {
    return kniBridge23(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, delegate.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEnabled", "B16@0:8", "knimi_com_activelabel24")
internal fun objcKniBridge25(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge25(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setEnabled:", "v20@0:8B16", "knimi_com_activelabel26")
internal fun objcKniBridge27(kniSC: NativePtr, kniR: NativePtr, enabled: Boolean): Unit {
    return kniBridge27(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, enabled.toByte())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_activelabel28")
internal fun objcKniBridge29(kniSC: NativePtr, kniR: NativePtr): UIPencilInteraction? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<UIPencilInteraction>(kniBridge29(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("willMoveToView:", "v24@0:8@16", "knimi_com_activelabel30")
internal fun objcKniBridge31(kniSC: NativePtr, kniR: NativePtr, view: UIView?): Unit {
    return kniBridge31(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, view.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("didMoveToView:", "v24@0:8@16", "knimi_com_activelabel32")
internal fun objcKniBridge33(kniSC: NativePtr, kniR: NativePtr, view: UIView?): Unit {
    return kniBridge33(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, view.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("view", "@16@0:8", "knimi_com_activelabel34")
internal fun objcKniBridge35(kniSC: NativePtr, kniR: NativePtr): UIView? {
    return interpretObjCPointerOrNull<UIView>(kniBridge35(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isEqual:", "B24@0:8@16", "knimi_com_activelabel36")
internal fun objcKniBridge37(kniSC: NativePtr, kniR: NativePtr, `object`: Any?): Boolean {
    return kniBridge37(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, `object`.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("class", "#16@0:8", "knimi_com_activelabel38")
internal fun objcKniBridge39(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge39(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:", "@24@0:8:16", "knimi_com_activelabel40")
internal fun objcKniBridge41(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge41(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:", "@32@0:8:16@24", "knimi_com_activelabel42")
internal fun objcKniBridge43(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge43(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("performSelector:withObject:withObject:", "@40@0:8:16@24@32", "knimi_com_activelabel44")
internal fun objcKniBridge45(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?, withObject: Any?, _withObject: Any?): Any? {
    return interpretObjCPointerOrNull<Any>(kniBridge45(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue, withObject.objcPtr(), _withObject.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isProxy", "B16@0:8", "knimi_com_activelabel46")
internal fun objcKniBridge47(kniSC: NativePtr, kniR: NativePtr): Boolean {
    return kniBridge47(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isKindOfClass:", "B24@0:8#16", "knimi_com_activelabel48")
internal fun objcKniBridge49(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge49(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("isMemberOfClass:", "B24@0:8#16", "knimi_com_activelabel50")
internal fun objcKniBridge51(kniSC: NativePtr, kniR: NativePtr, aClass: ObjCClass?): Boolean {
    return kniBridge51(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aClass.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("conformsToProtocol:", "B24@0:8@16", "knimi_com_activelabel52")
internal fun objcKniBridge53(kniSC: NativePtr, kniR: NativePtr, aProtocol: Protocol?): Boolean {
    return kniBridge53(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aProtocol.objcPtr()).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("respondsToSelector:", "B24@0:8:16", "knimi_com_activelabel54")
internal fun objcKniBridge55(kniSC: NativePtr, kniR: NativePtr, aSelector: COpaquePointer?): Boolean {
    return kniBridge55(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aSelector.rawValue).toBoolean()
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hash", "Q16@0:8", "knimi_com_activelabel56")
internal fun objcKniBridge57(kniSC: NativePtr, kniR: NativePtr): NSUInteger {
    return kniBridge57(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("superclass", "#16@0:8", "knimi_com_activelabel58")
internal fun objcKniBridge59(kniSC: NativePtr, kniR: NativePtr): ObjCClass? {
    return interpretObjCPointerOrNull<ObjCClass>(kniBridge59(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("description", "@16@0:8", "knimi_com_activelabel60")
internal fun objcKniBridge61(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge61(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("debugDescription", "@16@0:8", "knimi_com_activelabel62")
internal fun objcKniBridge63(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge63(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("new", "@16@0:8", "knimi_com_activelabel64")
internal fun objcKniBridge65(kniSC: NativePtr, kniR: NativePtr): ActiveLabel? {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge65(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("allocWithZone:", "@24@0:8^{_NSZone=}16", "knimi_com_activelabel66")
internal fun objcKniBridge67(kniSC: NativePtr, kniR: NativePtr, zone: CPointer<_NSZone>?): ActiveLabel? {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge67(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, zone.rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("alloc", "@16@0:8", "knimi_com_activelabel68")
internal fun objcKniBridge69(kniSC: NativePtr, kniR: NativePtr): ActiveLabel? {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge69(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appearance", "@16@0:8", "knimi_com_activelabel70")
internal fun objcKniBridge71(kniSC: NativePtr, kniR: NativePtr): ActiveLabel {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge71(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appearanceWhenContainedIn:", "@24@0:8#16", "knimi_com_activelabel72")
internal fun objcKniBridge73(kniSC: NativePtr, kniR: NativePtr, ContainerClass: UIAppearanceContainerProtocol?): ActiveLabel {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge73(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, ContainerClass.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appearanceWhenContainedInInstancesOfClasses:", "@24@0:8@16", "knimi_com_activelabel74")
internal fun objcKniBridge75(kniSC: NativePtr, kniR: NativePtr, containerTypes: List<*>): ActiveLabel {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge75(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, containerTypes.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appearanceForTraitCollection:", "@24@0:8@16", "knimi_com_activelabel76")
internal fun objcKniBridge77(kniSC: NativePtr, kniR: NativePtr, trait: UITraitCollection): ActiveLabel {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge77(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, trait.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appearanceForTraitCollection:whenContainedIn:", "@32@0:8@16#24", "knimi_com_activelabel78")
internal fun objcKniBridge79(kniSC: NativePtr, kniR: NativePtr, trait: UITraitCollection, whenContainedIn: UIAppearanceContainerProtocol?): ActiveLabel {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge79(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, trait.objcPtr(), whenContainedIn.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("appearanceForTraitCollection:whenContainedInInstancesOfClasses:", "@32@0:8@16@24", "knimi_com_activelabel80")
internal fun objcKniBridge81(kniSC: NativePtr, kniR: NativePtr, trait: UITraitCollection, whenContainedInInstancesOfClasses: List<*>): ActiveLabel {
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge81(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, trait.objcPtr(), whenContainedInInstancesOfClasses.objcPtr()))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("awakeFromNib", "v16@0:8", "knimi_com_activelabel82")
internal fun objcKniBridge83(kniSC: NativePtr, kniR: NativePtr): Unit {
    return kniBridge83(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("mentionColor", "@16@0:8", "knimi_com_activelabel84")
internal fun objcKniBridge85(kniSC: NativePtr, kniR: NativePtr): UIColor {
    return interpretObjCPointerOrNull<UIColor>(kniBridge85(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setMentionColor:", "v24@0:8@16", "knimi_com_activelabel86")
internal fun objcKniBridge87(kniSC: NativePtr, kniR: NativePtr, mentionColor: UIColor): Unit {
    return kniBridge87(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, mentionColor.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("mentionSelectedColor", "@16@0:8", "knimi_com_activelabel88")
internal fun objcKniBridge89(kniSC: NativePtr, kniR: NativePtr): UIColor? {
    return interpretObjCPointerOrNull<UIColor>(kniBridge89(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setMentionSelectedColor:", "v24@0:8@16", "knimi_com_activelabel90")
internal fun objcKniBridge91(kniSC: NativePtr, kniR: NativePtr, mentionSelectedColor: UIColor?): Unit {
    return kniBridge91(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, mentionSelectedColor.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hashtagColor", "@16@0:8", "knimi_com_activelabel92")
internal fun objcKniBridge93(kniSC: NativePtr, kniR: NativePtr): UIColor {
    return interpretObjCPointerOrNull<UIColor>(kniBridge93(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHashtagColor:", "v24@0:8@16", "knimi_com_activelabel94")
internal fun objcKniBridge95(kniSC: NativePtr, kniR: NativePtr, hashtagColor: UIColor): Unit {
    return kniBridge95(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, hashtagColor.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("hashtagSelectedColor", "@16@0:8", "knimi_com_activelabel96")
internal fun objcKniBridge97(kniSC: NativePtr, kniR: NativePtr): UIColor? {
    return interpretObjCPointerOrNull<UIColor>(kniBridge97(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHashtagSelectedColor:", "v24@0:8@16", "knimi_com_activelabel98")
internal fun objcKniBridge99(kniSC: NativePtr, kniR: NativePtr, hashtagSelectedColor: UIColor?): Unit {
    return kniBridge99(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, hashtagSelectedColor.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLColor", "@16@0:8", "knimi_com_activelabel100")
internal fun objcKniBridge101(kniSC: NativePtr, kniR: NativePtr): UIColor {
    return interpretObjCPointerOrNull<UIColor>(kniBridge101(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))!!
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setURLColor:", "v24@0:8@16", "knimi_com_activelabel102")
internal fun objcKniBridge103(kniSC: NativePtr, kniR: NativePtr, URLColor: UIColor): Unit {
    return kniBridge103(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLColor.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("URLSelectedColor", "@16@0:8", "knimi_com_activelabel104")
internal fun objcKniBridge105(kniSC: NativePtr, kniR: NativePtr): UIColor? {
    return interpretObjCPointerOrNull<UIColor>(kniBridge105(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setURLSelectedColor:", "v24@0:8@16", "knimi_com_activelabel106")
internal fun objcKniBridge107(kniSC: NativePtr, kniR: NativePtr, URLSelectedColor: UIColor?): Unit {
    return kniBridge107(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, URLSelectedColor.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("lineSpacing", "d16@0:8", "knimi_com_activelabel108")
internal fun objcKniBridge109(kniSC: NativePtr, kniR: NativePtr): CGFloat {
    return kniBridge109(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setLineSpacing:", "v24@0:8d16", "knimi_com_activelabel110")
internal fun objcKniBridge111(kniSC: NativePtr, kniR: NativePtr, lineSpacing: CGFloat): Unit {
    return kniBridge111(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, lineSpacing)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("minimumLineHeight", "d16@0:8", "knimi_com_activelabel112")
internal fun objcKniBridge113(kniSC: NativePtr, kniR: NativePtr): CGFloat {
    return kniBridge113(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setMinimumLineHeight:", "v24@0:8d16", "knimi_com_activelabel114")
internal fun objcKniBridge115(kniSC: NativePtr, kniR: NativePtr, minimumLineHeight: CGFloat): Unit {
    return kniBridge115(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, minimumLineHeight)
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("highlightFontName", "@16@0:8", "knimi_com_activelabel116")
internal fun objcKniBridge117(kniSC: NativePtr, kniR: NativePtr): String? {
    return interpretObjCPointerOrNull<String>(kniBridge117(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setHighlightFontName:", "v24@0:8@16", "knimi_com_activelabel118")
internal fun objcKniBridge119(kniSC: NativePtr, kniR: NativePtr, highlightFontName: String?): Unit {
    return kniBridge119(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, highlightFontName.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("font", "@16@0:8", "knimi_com_activelabel120")
internal fun objcKniBridge121(kniSC: NativePtr, kniR: NativePtr): UIFont? {
    return interpretObjCPointerOrNull<UIFont>(kniBridge121(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setFont:", "v24@0:8@16", "knimi_com_activelabel122")
internal fun objcKniBridge123(kniSC: NativePtr, kniR: NativePtr, font: UIFont?): Unit {
    return kniBridge123(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, font.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("textColor", "@16@0:8", "knimi_com_activelabel124")
internal fun objcKniBridge125(kniSC: NativePtr, kniR: NativePtr): UIColor? {
    return interpretObjCPointerOrNull<UIColor>(kniBridge125(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("setTextColor:", "v24@0:8@16", "knimi_com_activelabel126")
internal fun objcKniBridge127(kniSC: NativePtr, kniR: NativePtr, textColor: UIColor?): Unit {
    return kniBridge127(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, textColor.objcPtr())
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("intrinsicContentSize", "{CGSize=dd}16@0:8", "knimi_com_activelabel128")
internal fun objcKniBridge129(kniSC: NativePtr, kniR: NativePtr): CValue<CGSize> {
    val kniRetVal = nativeHeap.alloc<CGSize>()
    try {
        kniBridge129(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, kniRetVal.rawPtr)
        return kniRetVal.readValue()
    } finally { nativeHeap.free(kniRetVal) }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithFrame:", "@48@0:8{CGRect={CGPoint=dd}{CGSize=dd}}16", "knimi_com_activelabel130")
internal fun objcKniBridge131(kniSC: NativePtr, kniR: NativePtr, frame: CValue<CGRect>): ActiveLabel {
    objc_retain(kniR)
    memScoped {
        return interpretObjCPointerOrNull<ActiveLabel>(kniBridge131(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, frame.getPointer(memScope).rawValue))!!
    }
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("initWithCoder:", "@24@0:8@16", "knimi_com_activelabel132")
internal fun objcKniBridge133(kniSC: NativePtr, kniR: NativePtr, aDecoder: NSCoder): ActiveLabel? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge133(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue, aDecoder.objcPtr()))
}
@kotlin.native.internal.ExportForCompiler
@ObjCBridge("init", "@16@0:8", "knimi_com_activelabel134")
internal fun objcKniBridge135(kniSC: NativePtr, kniR: NativePtr): ActiveLabel? {
    objc_retain(kniR)
    return interpretObjCPointerOrNull<ActiveLabel>(kniBridge135(getMessenger(kniSC).rawValue, getReceiverOrSuper(kniR, kniSC).rawValue))
}
@SymbolName("com_activelabel_kniBridge0")
private external fun kniBridge0(p0: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge2")
private fun kniBridge2(p0: Byte, p1: NativePtr, p2: NativePtr): Unit {
    return unwrapKotlinObjectHolder<(Boolean, NSError?) -> Unit>(interpretObjCPointerOrNull<Any>(p2))(p0.toBoolean(), interpretObjCPointerOrNull<NSError>(p1))
}
@SymbolName("com_activelabel_kniBridge1")
private external fun kniBridge1(p0: ULong, p1: Byte, p2: NativePtr): Unit
@SymbolName("com_activelabel_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: Long): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge4")
private fun kniBridge4(p0: NativePtr, p1: NativePtr, p2: Long): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().guidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!, didChangeState = UIGuidedAccessRestrictionState.byValue(p2))
}
@SymbolName("com_activelabel_kniBridge5")
private external fun kniBridge5(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge6")
private fun kniBridge6(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().textForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_activelabel_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge8")
private fun kniBridge8(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().detailTextForGuidedAccessRestrictionWithIdentifier(restrictionIdentifier = interpretObjCPointerOrNull<String>(p1)!!).objcPtr())
}
@SymbolName("com_activelabel_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge10")
private fun kniBridge10(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIGuidedAccessRestrictionDelegateProtocol>().guidedAccessRestrictionIdentifiers().objcPtr())
}
@SymbolName("com_activelabel_kniBridge11")
private external fun kniBridge11(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge12")
private fun kniBridge12(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionDelegateProtocol>().pencilInteractionDidTap(interaction = interpretObjCPointerOrNull<UIPencilInteraction>(p1)!!)
}
@SymbolName("com_activelabel_kniBridge13")
private external fun kniBridge13(p0: NativePtr, p1: NativePtr): Long
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge14")
private fun kniBridge14(p0: NativePtr): Long {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().preferredTapAction()
}
@SymbolName("com_activelabel_kniBridge15")
private external fun kniBridge15(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge16")
private fun kniBridge16(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().new().objcPtr())
}
@SymbolName("com_activelabel_kniBridge17")
private external fun kniBridge17(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge18")
private fun kniBridge18(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_activelabel_kniBridge19")
private external fun kniBridge19(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge20")
private fun kniBridge20(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteractionMeta>().alloc().objcPtr())
}
@SymbolName("com_activelabel_kniBridge21")
private external fun kniBridge21(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge22")
private fun kniBridge22(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().delegate().objcPtr())
}
@SymbolName("com_activelabel_kniBridge23")
private external fun kniBridge23(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge24")
private fun kniBridge24(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().setDelegate(delegate = interpretObjCPointerOrNull<UIPencilInteractionDelegateProtocol>(p1))
}
@SymbolName("com_activelabel_kniBridge25")
private external fun kniBridge25(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge26")
private fun kniBridge26(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isEnabled().toByte()
}
@SymbolName("com_activelabel_kniBridge27")
private external fun kniBridge27(p0: NativePtr, p1: NativePtr, p2: Byte): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge28")
private fun kniBridge28(p0: NativePtr, p1: Byte): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().setEnabled(enabled = p1.toBoolean())
}
@SymbolName("com_activelabel_kniBridge29")
private external fun kniBridge29(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge30")
private fun kniBridge30(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().init().objcPtr())
}
@SymbolName("com_activelabel_kniBridge31")
private external fun kniBridge31(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge32")
private fun kniBridge32(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().willMoveToView(view = interpretObjCPointerOrNull<UIView>(p1))
}
@SymbolName("com_activelabel_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge34")
private fun kniBridge34(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().didMoveToView(view = interpretObjCPointerOrNull<UIView>(p1))
}
@SymbolName("com_activelabel_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge36")
private fun kniBridge36(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().view().objcPtr())
}
@SymbolName("com_activelabel_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge38")
private fun kniBridge38(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isEqual(`object` = interpretObjCPointerOrNull<Any>(p1)).toByte()
}
@SymbolName("com_activelabel_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge40")
private fun kniBridge40(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().`class`().objcPtr())
}
@SymbolName("com_activelabel_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge42")
private fun kniBridge42(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1)).objcPtr())
}
@SymbolName("com_activelabel_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge44")
private fun kniBridge44(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2)).objcPtr())
}
@SymbolName("com_activelabel_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge46")
private fun kniBridge46(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().performSelector(aSelector = interpretCPointer<COpaque>(p1), withObject = interpretObjCPointerOrNull<Any>(p2), _withObject = interpretObjCPointerOrNull<Any>(p3)).objcPtr())
}
@SymbolName("com_activelabel_kniBridge47")
private external fun kniBridge47(p0: NativePtr, p1: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge48")
private fun kniBridge48(p0: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isProxy().toByte()
}
@SymbolName("com_activelabel_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge50")
private fun kniBridge50(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isKindOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_activelabel_kniBridge51")
private external fun kniBridge51(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge52")
private fun kniBridge52(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().isMemberOfClass(aClass = interpretObjCPointerOrNull<ObjCClass>(p1)).toByte()
}
@SymbolName("com_activelabel_kniBridge53")
private external fun kniBridge53(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge54")
private fun kniBridge54(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().conformsToProtocol(aProtocol = interpretObjCPointerOrNull<Protocol>(p1)).toByte()
}
@SymbolName("com_activelabel_kniBridge55")
private external fun kniBridge55(p0: NativePtr, p1: NativePtr, p2: NativePtr): Byte
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge56")
private fun kniBridge56(p0: NativePtr, p1: NativePtr): Byte {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().respondsToSelector(aSelector = interpretCPointer<COpaque>(p1)).toByte()
}
@SymbolName("com_activelabel_kniBridge57")
private external fun kniBridge57(p0: NativePtr, p1: NativePtr): ULong
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge58")
private fun kniBridge58(p0: NativePtr): ULong {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().hash()
}
@SymbolName("com_activelabel_kniBridge59")
private external fun kniBridge59(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge60")
private fun kniBridge60(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().superclass().objcPtr())
}
@SymbolName("com_activelabel_kniBridge61")
private external fun kniBridge61(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge62")
private fun kniBridge62(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().description().objcPtr())
}
@SymbolName("com_activelabel_kniBridge63")
private external fun kniBridge63(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge64")
private fun kniBridge64(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<UIPencilInteraction>().debugDescription().objcPtr())
}
@SymbolName("com_activelabel_kniBridge65")
private external fun kniBridge65(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge66")
private fun kniBridge66(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().new().objcPtr())
}
@SymbolName("com_activelabel_kniBridge67")
private external fun kniBridge67(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge68")
private fun kniBridge68(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().allocWithZone(zone = interpretCPointer<_NSZone>(p1)).objcPtr())
}
@SymbolName("com_activelabel_kniBridge69")
private external fun kniBridge69(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge70")
private fun kniBridge70(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().alloc().objcPtr())
}
@SymbolName("com_activelabel_kniBridge71")
private external fun kniBridge71(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge72")
private fun kniBridge72(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().appearance().objcPtr())
}
@SymbolName("com_activelabel_kniBridge73")
private external fun kniBridge73(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge74")
private fun kniBridge74(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().appearanceWhenContainedIn(ContainerClass = interpretObjCPointerOrNull<UIAppearanceContainerProtocol>(p1)).objcPtr())
}
@SymbolName("com_activelabel_kniBridge75")
private external fun kniBridge75(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge76")
private fun kniBridge76(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().appearanceWhenContainedInInstancesOfClasses(containerTypes = interpretObjCPointerOrNull<List<*>>(p1)!!).objcPtr())
}
@SymbolName("com_activelabel_kniBridge77")
private external fun kniBridge77(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge78")
private fun kniBridge78(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().appearanceForTraitCollection(trait = interpretObjCPointerOrNull<UITraitCollection>(p1)!!).objcPtr())
}
@SymbolName("com_activelabel_kniBridge79")
private external fun kniBridge79(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge80")
private fun kniBridge80(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().appearanceForTraitCollection(trait = interpretObjCPointerOrNull<UITraitCollection>(p1)!!, whenContainedIn = interpretObjCPointerOrNull<UIAppearanceContainerProtocol>(p2)).objcPtr())
}
@SymbolName("com_activelabel_kniBridge81")
private external fun kniBridge81(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge82")
private fun kniBridge82(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabelMeta>().appearanceForTraitCollection(trait = interpretObjCPointerOrNull<UITraitCollection>(p1)!!, whenContainedInInstancesOfClasses = interpretObjCPointerOrNull<List<*>>(p2)!!).objcPtr())
}
@SymbolName("com_activelabel_kniBridge83")
private external fun kniBridge83(p0: NativePtr, p1: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge84")
private fun kniBridge84(p0: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().awakeFromNib()
}
@SymbolName("com_activelabel_kniBridge85")
private external fun kniBridge85(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge86")
private fun kniBridge86(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().mentionColor().objcPtr())
}
@SymbolName("com_activelabel_kniBridge87")
private external fun kniBridge87(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge88")
private fun kniBridge88(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setMentionColor(mentionColor = interpretObjCPointerOrNull<UIColor>(p1)!!)
}
@SymbolName("com_activelabel_kniBridge89")
private external fun kniBridge89(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge90")
private fun kniBridge90(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().mentionSelectedColor().objcPtr())
}
@SymbolName("com_activelabel_kniBridge91")
private external fun kniBridge91(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge92")
private fun kniBridge92(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setMentionSelectedColor(mentionSelectedColor = interpretObjCPointerOrNull<UIColor>(p1))
}
@SymbolName("com_activelabel_kniBridge93")
private external fun kniBridge93(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge94")
private fun kniBridge94(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().hashtagColor().objcPtr())
}
@SymbolName("com_activelabel_kniBridge95")
private external fun kniBridge95(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge96")
private fun kniBridge96(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setHashtagColor(hashtagColor = interpretObjCPointerOrNull<UIColor>(p1)!!)
}
@SymbolName("com_activelabel_kniBridge97")
private external fun kniBridge97(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge98")
private fun kniBridge98(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().hashtagSelectedColor().objcPtr())
}
@SymbolName("com_activelabel_kniBridge99")
private external fun kniBridge99(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge100")
private fun kniBridge100(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setHashtagSelectedColor(hashtagSelectedColor = interpretObjCPointerOrNull<UIColor>(p1))
}
@SymbolName("com_activelabel_kniBridge101")
private external fun kniBridge101(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge102")
private fun kniBridge102(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().URLColor().objcPtr())
}
@SymbolName("com_activelabel_kniBridge103")
private external fun kniBridge103(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge104")
private fun kniBridge104(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setURLColor(URLColor = interpretObjCPointerOrNull<UIColor>(p1)!!)
}
@SymbolName("com_activelabel_kniBridge105")
private external fun kniBridge105(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge106")
private fun kniBridge106(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().URLSelectedColor().objcPtr())
}
@SymbolName("com_activelabel_kniBridge107")
private external fun kniBridge107(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge108")
private fun kniBridge108(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setURLSelectedColor(URLSelectedColor = interpretObjCPointerOrNull<UIColor>(p1))
}
@SymbolName("com_activelabel_kniBridge109")
private external fun kniBridge109(p0: NativePtr, p1: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge110")
private fun kniBridge110(p0: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().lineSpacing()
}
@SymbolName("com_activelabel_kniBridge111")
private external fun kniBridge111(p0: NativePtr, p1: NativePtr, p2: Double): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge112")
private fun kniBridge112(p0: NativePtr, p1: Double): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setLineSpacing(lineSpacing = p1)
}
@SymbolName("com_activelabel_kniBridge113")
private external fun kniBridge113(p0: NativePtr, p1: NativePtr): Double
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge114")
private fun kniBridge114(p0: NativePtr): Double {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().minimumLineHeight()
}
@SymbolName("com_activelabel_kniBridge115")
private external fun kniBridge115(p0: NativePtr, p1: NativePtr, p2: Double): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge116")
private fun kniBridge116(p0: NativePtr, p1: Double): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setMinimumLineHeight(minimumLineHeight = p1)
}
@SymbolName("com_activelabel_kniBridge117")
private external fun kniBridge117(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge118")
private fun kniBridge118(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().highlightFontName().objcPtr())
}
@SymbolName("com_activelabel_kniBridge119")
private external fun kniBridge119(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge120")
private fun kniBridge120(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setHighlightFontName(highlightFontName = interpretObjCPointerOrNull<String>(p1))
}
@SymbolName("com_activelabel_kniBridge121")
private external fun kniBridge121(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge122")
private fun kniBridge122(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().font().objcPtr())
}
@SymbolName("com_activelabel_kniBridge123")
private external fun kniBridge123(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge124")
private fun kniBridge124(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setFont(font = interpretObjCPointerOrNull<UIFont>(p1))
}
@SymbolName("com_activelabel_kniBridge125")
private external fun kniBridge125(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge126")
private fun kniBridge126(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().textColor().objcPtr())
}
@SymbolName("com_activelabel_kniBridge127")
private external fun kniBridge127(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge128")
private fun kniBridge128(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().setTextColor(textColor = interpretObjCPointerOrNull<UIColor>(p1))
}
@SymbolName("com_activelabel_kniBridge129")
private external fun kniBridge129(p0: NativePtr, p1: NativePtr, p2: NativePtr): Unit
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge130")
private fun kniBridge130(p0: NativePtr, p1: NativePtr): Unit {
    return interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().intrinsicContentSize().write(p1)
}
@SymbolName("com_activelabel_kniBridge131")
private external fun kniBridge131(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge132")
private fun kniBridge132(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().initWithFrame(frame = interpretPointed<CGRect>(p1).readValue()).objcPtr())
}
@SymbolName("com_activelabel_kniBridge133")
private external fun kniBridge133(p0: NativePtr, p1: NativePtr, p2: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge134")
private fun kniBridge134(p0: NativePtr, p1: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().initWithCoder(aDecoder = interpretObjCPointerOrNull<NSCoder>(p1)!!).objcPtr())
}
@SymbolName("com_activelabel_kniBridge135")
private external fun kniBridge135(p0: NativePtr, p1: NativePtr): NativePtr
@kotlin.native.internal.ExportForCppRuntime("com_activelabel_kniBridge136")
private fun kniBridge136(p0: NativePtr): NativePtr {
    return objc_retainAutoreleaseReturnValue(interpretObjCPointerOrNull<Any>(p0)!!.uncheckedCast<ActiveLabel>().init().objcPtr())
}
@SymbolName("com_activelabel_kniBridge137")
private external fun kniBridge137(): NativePtr
@SymbolName("com_activelabel_kniBridge138")
private external fun kniBridge138(): Double
@SymbolName("com_activelabel_kniBridge139")
private external fun kniBridge139(p0: Double): Unit
@SymbolName("com_activelabel_kniBridge140")
private external fun kniBridge140(): NativePtr
